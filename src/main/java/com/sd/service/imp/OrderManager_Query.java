package com.sd.service.imp;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.sd.pojos.OrederManager_Query;
import com.sd.service.IOrderManager_QueryService;
import com.sd.service.SqlSessionTool;

public class OrderManager_Query implements IOrderManager_QueryService {

	@Override
	public List<OrederManager_Query> selectFetchByUserid(int userId){
		SqlSession session = SqlSessionTool.CreateSqlSession();
		List<OrederManager_Query> orederManager_Queries=session.selectList("mapper.OrderManagerMapper.selectFetchByUserid", userId);
		session.commit();
		session.close();
		return  orederManager_Queries;
	}
	
	@Override
	public List<OrederManager_Query> selectConsignByUserid(int userId){
		SqlSession session = SqlSessionTool.CreateSqlSession();
		List<OrederManager_Query> orederManager_Queries=session.selectList("mapper.OrderManagerMapper.selectConsignByUserid", userId);
		session.commit();
		session.close();
		return  orederManager_Queries;
	}
	
	@Override
	public List<OrederManager_Query> selectOtherByUserid(int userId){
		SqlSession session = SqlSessionTool.CreateSqlSession();
		List<OrederManager_Query> orederManager_Queries=session.selectList("mapper.OrderManagerMapper.selectOtherByUserid", userId);
		session.commit();
		session.close();
		return  orederManager_Queries;
	}
}
