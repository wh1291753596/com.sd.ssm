package com.sd.test;

import java.io.FileInputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.sd.bean.AddressKeyInfo;

public class TestAddressKeyInfo {

	private SqlSession session;
	
	@Before
	public void setUp() throws Exception {
		// 构建mybatis的执行对象
		FileInputStream fStream=new FileInputStream("src/main/resources/mybatisConfig.xml");
		SqlSession session=new SqlSessionFactoryBuilder().build(fStream).openSession();
		
		//配置session对象
		this.session=session;
	}

	@Test
	public void test() {
		System.out.println("收货地址关键信息获取测试");
		
		try {			
			//查询默认收货地址
			//AddressKeyInfo addressInfo =session.selectOne("mapper.addressKeyInfoMapper.selectDefaultAddInfo", 1);
			//查询用户所有收货地址
			List<AddressKeyInfo> addressInfos = session.selectList("mapper.addressKeyInfoMapper.selectAddInfo",1);
			session.commit();
			//System.out.println(addressInfo.toString());
			for (AddressKeyInfo addressInfo : addressInfos) {
				System.out.println(addressInfo.toString());
			}

		}
		finally {
			//关闭执行对象
			session.close();
		}
	}

}
