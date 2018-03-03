package com.sd.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.sd.bean.AddressKeyInfo;

public class GetUserAddressKeyInfo {
	private SqlSession session;

	public AddressKeyInfo GetDefaultAddressByUserId(int id) {
		try {
			// 获取mybatis配置文件
			FileInputStream fStream=new FileInputStream("src/main/resources/mybatisConfig.xml");
			//创建执行对象
			SqlSession session=new SqlSessionFactoryBuilder().build(fStream).openSession();
			this.session=session;
			//获取默认收货地址ַ
			AddressKeyInfo addressInfo =session.selectOne("mapper.AddressKeyInfoMapper.selectDefaultAddInfo", id);
			
			return addressInfo;
		} catch (FileNotFoundException e) {
			System.out.println("文件未找到！");
			return null;
		}
		finally {
			//关闭执行对象
			session.close();
		}
	}
	
	public List<AddressKeyInfo> GetNondefaulltAddressByUserId(int id){
		try {
			FileInputStream fStream=new FileInputStream("src/main/resources/mybatisConfig.xml");
			SqlSession session=new SqlSessionFactoryBuilder().build(fStream).openSession();
			this.session=session;
			
			//查询用户账下非默认收货地址
			List<AddressKeyInfo> addressKeyInfos =session.selectList("mapper.AddressKeyInfoMapper.selectAddInfo", id);
		
			return addressKeyInfos;
		} catch (FileNotFoundException e) {
			System.out.println("文件未找到！");
			return null;
		}
		finally {
			//关闭执行对象
			session.close();
		}
	}
}
