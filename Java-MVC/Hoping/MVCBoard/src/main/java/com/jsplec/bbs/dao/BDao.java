package com.jsplec.bbs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.jsplec.bbs.dto.BDto;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import java.util.Enumeration;
import com.oreilly.servlet.MultipartRequest;
import java.io.*;

public class BDao {

	DataSource dataSource;
	
	public BDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc");
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
			
			String query = "select bId, bName, bTitle, bContent, bDate, bImage from mvc_board";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				int bId = resultSet.getInt("bId");
				String bName = resultSet.getString("bName");
				String bTitle = resultSet.getString("bTitle");
				String bContent = resultSet.getString("bContent");
				String bDate = resultSet.getString("bDate");
				String bImage = resultSet.getString("bImage");
				
				BDto dto = new BDto(bId, bName, bTitle, bContent, bDate, bImage);
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

	// 전체 검색
	public BDto contentView(String sbId){
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		BDto dto = null; 
		try {
			connection = dataSource.getConnection();
			
			String query = "select bId, bName, bTitle, bContent, bDate, bImage from mvc_board where bId=? ";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, sbId);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				int bId = resultSet.getInt("bId");
				String bName = resultSet.getString("bName");
				String bTitle = resultSet.getString("bTitle");
				String bContent = resultSet.getString("bContent");
				String bDate = resultSet.getString("bDate");
				String bImage = resultSet.getString("bImage");
				
				dto = new BDto(bId, bName, bTitle, bContent, bDate, bImage);
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
	} // Content
	
	

	
	public void write(String bName, String bTitle, String bContent, String filename) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		
		try {
			connection = dataSource.getConnection();
			
			String query = "insert into mvc_board (bName, bTitle, bContent, bDate, bImage) values (?,?,?,now(),?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, bName);
			preparedStatement.setString(2, bTitle);
			preparedStatement.setString(3, bContent);
			preparedStatement.setString(4, filename);
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
	
	
	public void modify(int bId,String bName, String bTitle, String bContent) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "update mvc_board set bName=?, bTitle=?, bContent=?, bDate=now() where bId=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, bName);
			preparedStatement.setString(2, bTitle);
			preparedStatement.setString(3, bContent);
			preparedStatement.setInt(4, bId);
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
	
	
	public void delete(int bId) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "delete from mvc_board where bId=? ";
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setInt(1, bId);
			preparedStatement.executeUpdate();
			System.out.println(bId);
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
	
	//날짜 검색
	public ArrayList<BDto> searchDate(String start, String end){
		System.out.println(start);
		
		ArrayList<BDto> dtos = new ArrayList<>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			
			connection = dataSource.getConnection();
			//where ? 이렇게는 안됨
			String query = "SELECT * from mvc_board where bDate between '" + start + "' and '" + end + "'" ;
			
			preparedStatement = connection.prepareStatement(query);
			
			
			resultSet = preparedStatement.executeQuery(query);
			
			while(resultSet.next()) {
				
				int bId = resultSet.getInt("bId");
				String bName = resultSet.getString("bName");
				String bTitle = resultSet.getString("bTitle");
				String bContent = resultSet.getString("bContent");
				String bDate = resultSet.getString("bDate");
				String bImage = resultSet.getString("bImage");
				
				
				BDto dto = new BDto(bId, bName, bTitle, bContent, bDate, bImage);
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
		
	//사진보여주기 
	
	
}
