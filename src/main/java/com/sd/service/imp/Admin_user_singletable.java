package com.sd.service.imp;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.sd.bean.Admin_user;
import com.sd.service.IAdmin_user_singletable;
import com.sd.service.SqlSessionTool;

public class Admin_user_singletable implements IAdmin_user_singletable {

	@Override
	public List<Admin_user> selectAllAdminuser(){
		SqlSession session = SqlSessionTool.CreateSqlSession();
		List<Admin_user> users=session.selectList("com.sd.dao.Admin_userMapper.selectAllAdminuser");
		session.commit();
		session.close();
		return users;
	}
}
