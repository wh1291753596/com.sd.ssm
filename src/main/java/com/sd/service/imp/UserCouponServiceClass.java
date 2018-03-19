package com.sd.service.imp;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.sd.bean.Coupon;
import com.sd.bean.UserCoupon;
import com.sd.bean.UserCouponServicePojo;
import com.sd.service.IUserCouponService;

public class UserCouponServiceClass implements IUserCouponService {

	@Override
	public void creatCoupon(UserCoupon userCoupon) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCoupon(UserCoupon userCoupon) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updataCoupon(UserCoupon userCoupon) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<UserCouponServicePojo> selectCouponByUserId(Integer userID) {
		// TODO Auto-generated method stub
		
		Reader reader;
		try {
			reader = Resources.getResourceAsReader("mybatisConfig.xml");
			// 创建
			//创建执行对象
			SqlSession session=new SqlSessionFactoryBuilder().build(reader).openSession();	
			
			List<UserCouponServicePojo>coupons=session.selectList("mapper.UserCouponServiceMapper.selectCouponByUserId",userID);
			session.close();
			return coupons;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("There are some problems.");
			return null;
			//e.printStackTrace();
		}
	}

}
