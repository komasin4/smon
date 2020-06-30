package com.komasin4.smon.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestDao {
	protected static final String NAMESPACE = "com.komasin4.smon.dao.";

	@Autowired
	private SqlSession sqlSession;

	public String selectTest(){
		return sqlSession.selectOne(NAMESPACE + "selectTest");
	}
}
