package com.jsplec.bbs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.jsplec.bbs.dto.BDto;

public class BDao {

	DataSource dataSource;
	
	public BDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/customer");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	// 전체 검색
	public ArrayList<BDto> List(){
		ArrayList<BDto> dtos = new ArrayList<BDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select seq, name, tel, address, email, relation from Address";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				int seq = resultSet.getInt("seq");
				String name = resultSet.getString("name");
				String tel = resultSet.getString("tel");
				String address = resultSet.getString("address");
				String email = resultSet.getString("email");
				String relation = resultSet.getString("relation");
				
				BDto dto = new BDto(seq, name, tel, address, email, relation);
				dtos.add(dto);
			}
			
		}catch (Exception e) {
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
	} // list
	
	public void write(String name, String tel, String address, String email, String relation) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "insert into Address (name, tel, address, email, relation) values (?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, tel);
			preparedStatement.setString(3, address);
			preparedStatement.setString(4, email);
			preparedStatement.setString(5, relation);
			
			preparedStatement.executeUpdate();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	} //write
	
	public BDto contentView(String sSeq) {
		BDto dto = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select * from Address where seq = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, Integer.parseInt(sSeq));
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				int seq = resultSet.getInt("seq");
				String name = resultSet.getString("name");
				String tel = resultSet.getString("tel");
				String address = resultSet.getString("address");
				String email = resultSet.getString("email");
				String relation = resultSet.getString("relation");
				
				dto = new BDto(seq, name, tel, address, email, relation);
			}
			
		}catch (Exception e) {
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
		
	} // Content_view
	
	public void modify(int seq, String name, String tel, String address, String email, String relation) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "update Address set name=?, tel=?, address=?, email=?, relation=? where seq=? ";
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, name);
			preparedStatement.setString(2, tel);
			preparedStatement.setString(3, address);
			preparedStatement.setString(4, email);
			preparedStatement.setString(5, relation);
			preparedStatement.setInt(6, seq);
			preparedStatement.executeUpdate();

			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	} //modify
	
	public void delete(int seq) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "delete from Address where seq=? ";
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setInt(1, seq);
			preparedStatement.executeUpdate();
			System.out.println(seq);
			System.out.println(query);
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	} //delete
	
	
	
	
	
	
	
	
	
	
	
}
