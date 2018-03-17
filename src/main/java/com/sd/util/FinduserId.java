package com.sd.util;

import org.apache.ibatis.session.SqlSession;

import com.sd.bean.user;
import com.sd.dao.userMapper;
import com.sd.service.SqlSessionTool;

public class FinduserId
{
	public Integer getuserid(String username)
	{
		SqlSession session = SqlSessionTool.CreateSqlSession();
		userMapper iUserMapper = session.getMapper(userMapper.class);
		user uuUser = new user();
		uuUser = iUserMapper.selectByName(username);
		System.out.println(uuUser.getName());
		System.out.println(uuUser.getId());
		return uuUser.getId();
	}
}
