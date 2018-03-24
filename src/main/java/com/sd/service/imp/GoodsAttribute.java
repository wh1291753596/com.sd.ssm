package com.sd.service.imp;

import org.apache.ibatis.session.SqlSession;


import com.sd.pojos.GoodsAttributeInfo;
import com.sd.service.IGoodsAttributeService;
import com.sd.service.SqlSessionTool;

public class GoodsAttribute implements IGoodsAttributeService {

	@Override
	public void insertRecord(GoodsAttributeInfo goodsAttributeInfo) {
		SqlSession session = SqlSessionTool.CreateSqlSession();
		session.insert("mapper.GoodAttribute.insertRecord", goodsAttributeInfo);
		session.commit();
		session.close();
	}
	@Override
	public GoodsAttributeInfo selectByGoodid(Integer goodsId) {
		SqlSession session = SqlSessionTool.CreateSqlSession();
		GoodsAttributeInfo goodsAttributeInfo=new GoodsAttributeInfo();
		session.insert("mapper.GoodAttribute.selectByGoodid", goodsId);
		return goodsAttributeInfo;
	}
}
