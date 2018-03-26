package com.sd.service.imp;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.sd.bean.GetOrderInfo;
import com.sd.bean.SendOrderInfo;
import com.sd.service.SqlSessionTool;

public class GetSendOrderInfoService implements com.sd.service.IGetSendOrderInfoService {

	@Override
	public List<GetOrderInfo> SelectGetOrderInfoByOrderStatus(int orderStatusId) {
		SqlSession sqlSession = SqlSessionTool.CreateSqlSession();
		List<GetOrderInfo> getOrderInfos = sqlSession.selectList("com.sd.bean.dao.GetSendOrderInfoMapper.selectGetOrderInfoByOrderStatus", orderStatusId);
		sqlSession.commit();
		sqlSession.close();
		
		return getOrderInfos;
	}

	@Override
	public List<SendOrderInfo> SelectSendOrderInfoByOderStatus(int orderStatusId) {
		SqlSession sqlSession = SqlSessionTool.CreateSqlSession();
		List<SendOrderInfo> sendOrderInfos = sqlSession.selectList("com.sd.bean.dao.GetSendOrderInfoMapper.selectSendOrderInfoByOrderStatus", orderStatusId);
		sqlSession.commit();
		sqlSession.close();		
		
		return sendOrderInfos;
	}

}
