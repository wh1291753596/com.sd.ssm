package com.sd.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.sd.dao.userMapper;
/*
 * 测试dao层工作
 * 
 * 1.导入springtest模块
 * 2.使用@ContextConfiguration指定spring配置文件的位置
 * @RunWith是junit提供的测试，指定用哪个来进行测试
 * 3.使用@Autowired来测试我们在运行的过程中要使用的组件
 * @Rollback
 * 表明被注解方法的事务在完成后是否需要被回滚。 如果true，事务将被回滚，否则事务将被提交。
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class test2 {
	@Autowired
	userMapper userMapper;
	
	@Test
	@Rollback(false)
	public void testmapper() {
		System.out.println(userMapper);

		userMapper.insert(new com.sd.bean.user("5555", "helo", 15, "985"));
	}

}
