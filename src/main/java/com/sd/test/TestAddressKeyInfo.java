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
		// ����mybatis��ִ�ж���
		FileInputStream fStream=new FileInputStream("src/main/resources/mybatisConfig.xml");
		SqlSession session=new SqlSessionFactoryBuilder().build(fStream).openSession();
		
		//����session����
		this.session=session;
	}

	@Test
	public void test() {
		System.out.println("�ջ���ַ�ؼ���Ϣ��ȡ����");
		
		try {			
			//��ѯĬ���ջ���ַ
			//AddressKeyInfo addressInfo =session.selectOne("mapper.addressKeyInfoMapper.selectDefaultAddInfo", 1);
			//��ѯ�û������ջ���ַ
			List<AddressKeyInfo> addressInfos = session.selectList("mapper.addressKeyInfoMapper.selectAddInfo",1);
			session.commit();
			//System.out.println(addressInfo.toString());
			for (AddressKeyInfo addressInfo : addressInfos) {
				System.out.println(addressInfo.toString());
			}

		}
		finally {
			//�ر�ִ�ж���
			session.close();
		}
	}

}
