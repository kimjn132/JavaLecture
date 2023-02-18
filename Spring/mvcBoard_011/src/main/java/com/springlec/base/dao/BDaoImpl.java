package com.springlec.base.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.springlec.base.model.BDto;

public class BDaoImpl implements BDao {
	
	SqlSession sqlSession;
	
	public static String nameSpace = "com.springlec.base.dao.BDao";

	@Override
	public List<BDto> listDao() throws Exception {
		
		return sqlSession.selectList(nameSpace + ".listDao");
	}

	@Override
	public void writeDao(String bName, String bTitle, String bContent) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(nameSpace + ".writeDao");
	}

	@Override
	public BDto viewDao(int bId) throws Exception {
		// TODO Auto-generated method stub
		return (BDto) sqlSession.selectList(nameSpace + ".viewDao");
	}

	@Override
	public void deleteDao(int bId) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.delete(nameSpace + ".deleteDao");
	}

	@Override
	public void modifyDao(String bName, String bTitle, String bContent, int bId) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update(nameSpace + ".modifyDao");
	}






}
