package com.jsplec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.jsplec.dto.FileDto;

public class FileDao {
	
DataSource dataSource;
	
	public FileDao() {
		// TODO Auto-generated constructor stub
		try {
			Context context = new InitialContext();
			//java:comp/env 가 context.xml에서 코드 쓰기 전까지
			//jdbc.mvc는 name
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/camping");
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
	}//FileDao
	
	//file 업로드------
	public int fileUpload(String fileName) {
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int returnValue = 0;
		
		//rs랑 arraylist 필요 x 인서트만 하니까
		
		try {
			
			connection = dataSource.getConnection();
			
			String query = "insert into regcamp (regTel, regCategory, regDetailaddress, regName, regDate, regImage1, host_hSeq) ";
			String query2 = "values (010-1111-1112, '계곡', '제주도', '제주캠프', curdate(), ?, 1) ";
			
			preparedStatement = connection.prepareStatement(query + query2);
			
			preparedStatement.setString(1, fileName);
			
			returnValue = preparedStatement.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return returnValue;
	}//fileUpload
	
	//file 보여주깅------
	//상세페이지 출력 
		public FileDto fileView() {
			FileDto dto = null;
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			
			try {

				connection = dataSource.getConnection();
				String query = "select regName, regImage1 from regcamp where regSeq=5 ";
				
				preparedStatement = connection.prepareStatement(query);
				resultSet = preparedStatement.executeQuery();
				
				if(resultSet.next()) {
					//하나니까 if로. 
					String regName = resultSet.getString("regName");
					String regImage1 = resultSet.getString("regImage1");
					
					dto = new FileDto(regName, regImage1);
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
			return dto;
		}//detail_view
	

}
