package com.springlec.base.dao;

public interface ClientDao {
	
	public void cJoinDao(String cId, String cPw, String cName, String cPhone, String cEmail, String cDate, int zonecode, String address, String buildingName, String detailAddress) throws Exception;
	
}
