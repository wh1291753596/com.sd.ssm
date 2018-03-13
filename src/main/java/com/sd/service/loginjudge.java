package com.sd.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.jdbc.Null;
import org.apache.ibatis.session.SqlSession;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sd.bean.user;
import com.sd.bean.userExample;
import com.sd.bean.userExample.Criteria;
import com.sd.dao.SendMapper;
import com.sd.dao.userMapper;


public class loginjudge {



	public List<user> all(String name) {	
		
		userExample userExample=new userExample();
		
		/*userExample example=new userExample();*/
		userExample.Criteria criteria=userExample.createCriteria();
		criteria.andNameEqualTo(name);
		
		SqlSession session=SqlSessionTool.CreateSqlSession();
		userMapper iUserMapper=session.getMapper(userMapper.class);
		
		List<user> test=iUserMapper.selectByExample(userExample);
		/*ArrayList<user> users = new ArrayList<user>();
		users = (ArrayList<user>) userMapper.selectByExample(userExample);*/
		return test;
	}

	public boolean name(String name) {
		/*userExample suserExample=new userExample();
		userExample.Criteria criteria = suserExample.createCriteria();
		criteria.andNameEqualTo(name);
		ArrayList<user> users = new ArrayList<user>();
		users = (ArrayList<user>) userMapper.selectByExample(suserExample);
		if (users.equals(null)) {
			return false;
		} else {
			return true;
		}
*/		return true;
	}
	
	public user byname(String name) {
		user iUser=new user();
		SqlSession session=SqlSessionTool.CreateSqlSession();
		userMapper iUserMapper=session.getMapper(userMapper.class);
		iUser=iUserMapper.selectByName(name);
		System.out.println(iUser);
		return iUser;
	}
}
