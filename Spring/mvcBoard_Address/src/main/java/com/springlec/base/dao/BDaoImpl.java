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
	public void writeDao(String name, String tel, String address, String email, String relation) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(nameSpace + ".writeDao");
	}

	@Override
	public BDto viewDao(int seq) throws Exception {
		// TODO Auto-generated method stub
		return (BDto) sqlSession.selectList(nameSpace + ".viewDao");
	}

	@Override
	public void deleteDao(int seq) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.delete(nameSpace + ".deleteDao");
	}

	@Override
	public void modifyDao(String name, String tel, String address, String email, String relation, int seq) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update(nameSpace + ".modifyDao");
	}
}