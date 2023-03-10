package com.bootcamp.client.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.bootcamp.joindto.campDto;



public class CampDao {
	
	DataSource dataSource;

	public CampDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/camping");
		}catch(Exception e){
			e.printStackTrace();
		}
	}	

	public ArrayList<campDto> listCamp(String strregSeq){
		ArrayList<campDto> dtos = new ArrayList<campDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		campDto dto;
		
		try {
			connection = dataSource.getConnection();
			System.out.println("Query start");
			String query = "select * from regcamp where regSeq = "+strregSeq;;
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			System.out.println("Query Execute");
			
			while(resultSet.next()) {
				int regSeq = resultSet.getInt("regSeq");
				String regName = resultSet.getString("regName");
				String regCategory = resultSet.getString("regCategory");
				
				int roNum = resultSet.getInt("roNum");
				int roPrice = resultSet.getInt("roPrice");
				int roMax = resultSet.getInt("roMax");
				

				System.out.println("regSeq:"+strregSeq+":");

				dto = new campDto(regSeq, regName, regCategory, roNum, roPrice, roMax);
				dtos.add(dto);
				System.out.println("DTO Add");
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
	} // listCamp	

	
	public ArrayList<campDto> dateCheck(String startdate, String stopdate){
		ArrayList<campDto> dtos = new ArrayList<campDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		campDto dto;
		
		try {
			connection = dataSource.getConnection();
			System.out.println("Query start");
			
			// ????????? ????????? ?????? ?????????????????? ???????????? SQL ??? (????????? ????????? ???????????? ???????????? ????????? ????????? ??? ?????? ???????????? ??????) - ??????
			// ???????????? ?????? ?????? ??? ?????? ?????? - ??????
			
			String query = "select distinct * from checkDate2 where roNum not in ( select distinct roNum from checkDate2 where boCheckindate between '"+startdate+"' and '"+stopdate+"')";; 
			
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			System.out.println("Query Execute");
			
			while(resultSet.next()) {
				int regSeq = resultSet.getInt("regSeq");
				String regName = resultSet.getString("regName");
				String regCategory = resultSet.getString("regCategory");
				
				int roNum = resultSet.getInt("roNum");
				int roPrice = resultSet.getInt("roPrice");
				int roMax = resultSet.getInt("roMax");
				

				System.out.println("startdate:"+startdate+":");
				System.out.println("stoptdate:"+stopdate+":");
				
				dto = new campDto(regSeq, regName, regCategory, roNum, roPrice, roMax);
				dtos.add(dto);
				System.out.println("DTO Add");

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
	} // DateCheck	
	public int readMaxSeq() {
		// Debug??? ?????? ?????? ??????.room Seqence Number??? ?????????.
		System.out.println("readMaxSeq_______________________________________________");
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		int result = 0;
		try {
			connection = dataSource.getConnection();
			
			// Max Seq ?????? SQL??? - alias??? ???????????? ?????????. - ??????
			String query = "select max(boSeq) as result from book ";
			preparedStatement = connection.prepareStatement(query);
			System.out.println("Query:"+query);
			
			resultSet = preparedStatement.executeQuery();
			System.out.println("Query readMaxSeq Execute");
			
			if(resultSet.next()) {
				result = resultSet.getInt("result");
			}
			
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
		return result;
	} //readMaxSeq
	
	/* 2022-11-11 hosik - ????????????	
						  ???????????? ??? ????????? ????????? ???????????? 
	*/
	public int diffDate(String Startdate, String Stopdate) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		int result = 0;
		try {
			connection = dataSource.getConnection();
			
			String query = "select TimeStampdiff(day,'"+Startdate+"','"+Stopdate+"') as result";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			System.out.println(query);
			System.out.println("Query diffDate Execute");
			
			if(resultSet.next()) {
				result = resultSet.getInt("result");
			}
			
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
		return result+1;
	} //diffDate

	
	// ????????? ?????? ????????? ????????? ????????? ??????
	public String Nextday(String Startdate) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String result = null;
		try {
			connection = dataSource.getConnection();
			
			String query = "select adddate('"+Startdate+"',1) as result;";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			System.out.println(query);
			System.out.println("Query diffDate Execute");
			
			if(resultSet.next()) {
				result = resultSet.getString("result");
			}
			
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
		return result;
	} //diffDate
	
	// ????????? ???????????? ????????? ??????
	public int insertBook(int boPrice, String boCheckindate, int boGroup, int boCount, String cId, int regSeq, int host_hSeq) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int result = 0;
		try {
			connection = dataSource.getConnection();
			String query = "insert into book (boPrice, boDate, boCheckindate, boGroup, boCount, ";
			String query2 = "pay_cid, pay_room_roseq, pay_room_regcamp_regSeq, pay_room_regcamp_host_hSeq, pay_client_cid ) values ";
			String query3 = "("+boPrice+",now(),'"+boCheckindate+"',"+boGroup+","+boCount+",'asdfg', 13,1,1,'"+cId+"') ";
			System.out.println("boPrice"+boPrice);
			System.out.println("boCheckindate"+boCheckindate);
			System.out.println("boGroup"+boGroup);
			System.out.println("boCount"+boCount);
			System.out.println("cId"+cId);
			System.out.println("regSeq"+regSeq);
			System.out.println("host_hSeq"+host_hSeq);
			preparedStatement = connection.prepareStatement(query+query2+query3);

			System.out.println(query);
			System.out.println(query2);
			System.out.println(query3);
			result = preparedStatement.executeUpdate(query+query2+query3);
			System.out.println("insertBook executeUpdate---------------------------"+result);	
			
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
		return result;
	} //insertbook

	// ?????? ?????? ????????? ????????? ???????????? ????????? ?????? ?????? ????????? ????????? ???????????? ??????????????? ???????????? ????????? 
	public void updateBook(int boGroup) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		// SQL ??? ????????? PreparedStatement setString
		try {
			connection = dataSource.getConnection();
			String query = "update book set boGroup = "+boGroup+" where boSeq="+boGroup;
			preparedStatement = connection.prepareStatement(query);
			System.out.println(boGroup);
			System.out.println(query);
			preparedStatement.executeUpdate(query);
			System.out.println("update Book executeUpdate---------------------------");				
			
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
	} //updateBook
	
	// RoomPrice??? ???????????? ?????? ????????? ????????? SQL????????? ??????????????? ?????????. ??????	
	public int readRoomPrice(String regcamp_regSeq, String roNum) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		int result = 0;
		System.out.println("readRoomPrice__________________________________________________________");
		try {
			connection = dataSource.getConnection();
			String query = "select roPrice from room where regcamp_regSeq = "+regcamp_regSeq+" and roNum = "+roNum+";";
			System.out.println("readRoomPrice____"+regcamp_regSeq);
			System.out.println("readRoomPrice____"+roNum);
			System.out.println(Integer.parseInt(regcamp_regSeq));
			System.out.println(Integer.parseInt(roNum));
			preparedStatement = connection.prepareStatement(query);

			resultSet = preparedStatement.executeQuery(query);
			System.out.println(query);
			System.out.println("Query readRoomPrice Execute");
			
			if(resultSet.next()) {
				result = resultSet.getInt("roPrice");
			}
			System.out.println("readRoomPrice executeUpdate------------result:"+result+":");				
			
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
		return result;
	} //readRoomPrice
}
