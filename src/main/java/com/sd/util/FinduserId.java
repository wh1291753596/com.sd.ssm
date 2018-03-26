package com.sd.util;

import org.apache.ibatis.session.SqlSession;

import com.sd.bean.user;
import com.sd.dao.userMapper;
import com.sd.service.SqlSessionTool;


/*
 * acthor:WangHao
 * time：2018/03/17
*/
public class FinduserId
{
	public Integer getuserid(String username)
	{
		SqlSession session = SqlSessionTool.CreateSqlSession();
		userMapper iUserMapper = session.getMapper(userMapper.class);
		user uuUser = new user();
		uuUser = iUserMapper.selectByName(username);	
		return uuUser.getId();
	}
}
