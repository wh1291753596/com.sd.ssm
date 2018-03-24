package com.sd.service.imp;

import org.apache.ibatis.session.SqlSession;

import com.sd.bean.Order;
import com.sd.service.IOrderService;
import com.sd.service.SqlSessionTool;

public class OrderService implements IOrderService {

	@Override
	public int ChangeOrderStatus(Order order,Integer statusId) {
	
		//先对order对象进行修改处理
		order.setOrderStatusId(statusId);
		
		//进行数据库更新
		SqlSession sqlSession = SqlSessionTool.CreateSqlSession();
		int count = sqlSession.update("com.sd.dao.OrderMapper.updateByPrimaryKey", order);
		sqlSession.commit();
		sqlSession.close();
		
		return count;
	}

	public Order SelectOrderByPrimaryKey(int id) {
		SqlSession sqlSession = SqlSessionTool.CreateSqlSession();
		Order order = sqlSession.selectOne("com.sd.dao.OrderMapper.selectByPrimaryKey", id);
		sqlSession.commit();
		sqlSession.close();
		
		return order;
	}
}
