package com.jsplec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.jsplec.dto.PagingDto;


public class PagingDao {
	
	DataSource dataSource;
	
	public PagingDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc");
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
	}//PagingDao
	
	//총 row 개수------------------
	public int countRow() {
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		int rowcount = 0;
		
		try {

			connection = dataSource.getConnection();
			String query = "select count(*) as rowcount from host ";
		
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				//하나니까 if로. 
				rowcount = resultSet.getInt("rowcount");
				
			}
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return rowcount;
	}
	
	//검색 
		public ArrayList<PagingDto> list(int startRow, int pageRow){
			
			ArrayList<PagingDto> dtos = new ArrayList<>();
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			
			try {
				
				connection = dataSource.getConnection();
				
				String query = "SELECT hSeq, hId from host limit ?, ? ";
				
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setInt(1, startRow);
				preparedStatement.setInt(2, pageRow);
				resultSet = preparedStatement.executeQuery();
				
				while(resultSet.next()) {
					
					String hSeq = resultSet.getString("hSeq");
					String hId = resultSet.getString("hId");
					
					PagingDto dto = new PagingDto(hSeq, hId);
					dtos.add(dto);
					//dtos는 ArrayList. ArrayList에 dto 객체를 하나씩 넣어준 것.
					
				}
				
			}catch(Exception e){
				e.printStackTrace();
			}finally {
				try {
					if(resultSet != null) resultSet.close();
					if(preparedStatement != null) preparedStatement.close();
					if(connection != null) connection.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			return dtos;
		}//list
	

}//END
