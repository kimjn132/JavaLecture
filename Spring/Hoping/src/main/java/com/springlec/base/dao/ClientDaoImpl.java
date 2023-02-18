package com.springlec.base.dao;

import org.apache.ibatis.session.SqlSession;

public class ClientDaoImpl implements ClientDao {

	SqlSession sqlSession;
	
	public static String nameSpace = "com.springlec.base.dao.ClientDao";
	
	@Override
	public void cJoinDao(String cId, String cPw, String cName, String cPhone, String cEmail, String cDate, int zonecode,
			String address, String buildingName, String detailAddress) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(nameSpace + ".cJoinDao");
	}

}
