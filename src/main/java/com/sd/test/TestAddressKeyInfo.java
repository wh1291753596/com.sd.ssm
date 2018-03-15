package com.sd.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.sd.bean.AddressKeyInfo;
import com.sd.bean.Coupon;
import com.sd.bean.Image;
import com.sd.bean.Send;
import com.sd.dao.SendMapper;
import com.sd.dao.TempMapper;
import com.sd.service.GetUserAddressKeyInfo;
import com.sd.service.SqlSessionTool;
import com.sd.service.imp.UserCouponServiceClass;
;

public class TestAddressKeyInfo {

	private SqlSession session;

	@Test
	public void test() {
/*		System.out.println("获取收货地址信息测试\r\n");
		GetUserAddressKeyInfo getAddInnfo=new GetUserAddressKeyInfo();

		System.out.println("默认收货地址为：");
		AddressKeyInfo defaultAddInfo=getAddInnfo.GetDefaultAddressByUserId(1);
		System.out.println(defaultAddInfo.toString()+"\r\n");
	
		System.out.println("非默认收货地址为：");
		List<AddressKeyInfo> addressKeyInfos = getAddInnfo.GetNondefaulltAddressByUserId(1);
		for(AddressKeyInfo addressKeyInfo : addressKeyInfos) {
			System.out.println(addressKeyInfo.toString());
		}	*/	
		
	/*	SqlSession session=SqlSessionTool.CreateSqlSession();
		TempMapper sendMapper = session.getMapper(TempMapper.class);
		
		Date ob=new Date();
		
		//创建send记录
		Send send=new Send();
	
		send.setCompany("123");
		Timestamp now=new Timestamp(2018, 03, 05, 8, 6, 5, 3);
		send.setCreateTime(now);
		int count = sendMapper.deleteByPrimaryKey("1");
		session.commit();
		session.close();
		
		System.out.println("影响行数"+count);*/
	/*	Timestamp now=new Timestamp(2018, 03, 05, 8, 6, 5, 3);
		
		Image image=new Image();
		image.setCreateTime(now);
		image.setHeight((short) 10);
		image.setId(5);
		image.setName("");
		image.setPath("");
		image.setUpdateTime(now);
		image.setWidth((short) 10);
		
		Coupon coupon=new Coupon();
		coupon.setId(1515);
		coupon.setMoney(new BigDecimal("12.33"));
		coupon.setType((byte) 2);
		coupon.setIssuedQuantity(15);
		coupon.setReceiveQuantity(15);
		coupon.setCreateTime(now);
		coupon.setFlag((byte) 1);
		coupon.setName("");
		
		CouponServiceClass couponServiceClass=new CouponServiceClass();
	    couponServiceClass.creatCoupon(image, coupon);*/
		
		UserCouponServiceClass uServiceClass=new UserCouponServiceClass();
		List<Coupon> coupons=uServiceClass.selectCouponByUserId(1);
		System.out.println("我执行完毕");
	}

}
