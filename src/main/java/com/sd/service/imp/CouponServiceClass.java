package com.sd.service.imp;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.sd.bean.Coupon;
import com.sd.bean.Image;
import com.sd.dao.CouponMapper;
import com.sd.dao.ImageMapper;
import com.sd.service.ICouponService;
import com.sd.service.SqlSessionTool;

public class CouponServiceClass implements ICouponService {

	@Override
	public void deleteCoupon(Image image, Coupon coupon) {
		// TODO Auto-generated method stub
		// 加载配置
		try {
			Reader reader = Resources.getResourceAsReader("mybatisConfig.xml");
			// 创建
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = builder.build(reader);
			SqlSession session = factory.openSession();
			// 尚不确定图片结果
			ImageMapper imageMapper = session.getMapper(ImageMapper.class);
			imageMapper.deleteByPrimaryKey(image.getId());

			CouponMapper couponMapper = session.getMapper(CouponMapper.class);
			couponMapper.deleteByPrimaryKey(coupon.getId());
			session.commit();
			session.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updataCoupon(Image image, Coupon coupon) {
		// TODO Auto-generated method stub
		try {
			Reader reader = Resources.getResourceAsReader("mybatisConfig.xml");
			// 创建
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = builder.build(reader);
			SqlSession session = factory.openSession();

			ImageMapper imageMapper = session.getMapper(ImageMapper.class);
			imageMapper.updateByPrimaryKeySelective(image);

			CouponMapper couponMapper = session.getMapper(CouponMapper.class);
			couponMapper.updateByPrimaryKeySelective(coupon);
			session.commit();
			session.close();
			// 尚不确定
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void creatCoupon(Image image, Coupon coupon) {
		if (coupon == null)
			return;
		if (image != null)
			coupon.setImageId(image.getId());
		else
			coupon.setImageId(1);
		// TODO Auto-generated method stub
		try {

			// 加载配置
			// 获取mybatis配置文件
			//FileInputStream fStream = new FileInputStream("C:/Users/FCmmmmmm/git/com.sd.ssm/src/main/resources/mybatisConfig.xml");
			Reader reader = Resources.getResourceAsReader("mybatisConfig.xml");
			// 创建
			//创建执行对象
			SqlSession session=new SqlSessionFactoryBuilder().build(reader).openSession();	
			ImageMapper imageMapper = session.getMapper(ImageMapper.class);
			imageMapper.insert(image);
			session.commit();
			CouponMapper couponMapper = session.getMapper(CouponMapper.class);
			couponMapper.insert(coupon);
			session.commit();
			session.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("在");
		} finally {

		}

	}

}
