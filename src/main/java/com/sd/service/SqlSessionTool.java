package com.sd.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionTool {
	public static SqlSession CreateSqlSession() {
		
		try {
			// 获取mybatis配置文件
			FileInputStream fStream=new FileInputStream("src/main/resources/mybatisConfig.xml");
			//创建会话对象
			SqlSession session=new SqlSessionFactoryBuilder().build(fStream).openSession();
			return session;
		}
		catch(FileNotFoundException exception) {
			System.out.println("文件未找到!");
			return null;
		}		
	}
}

