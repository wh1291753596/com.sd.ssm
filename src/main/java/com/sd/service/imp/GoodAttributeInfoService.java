package com.sd.service.imp;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.sd.bean.GoodAttributeInfo;
import com.sd.service.IGoodAttributeInfoService;
import com.sd.service.SqlSessionTool;

public class GoodAttributeInfoService implements IGoodAttributeInfoService {

	@Override
	public List<GoodAttributeInfo> selectAll(){
		SqlSession session = SqlSessionTool.CreateSqlSession();
		List<GoodAttributeInfo> goodAttributeInfos=session.selectList("mapper.GoodAttributeInfo.selectAll");
		session.commit();
		session.close();		
		return goodAttributeInfos;
				
	}
}
