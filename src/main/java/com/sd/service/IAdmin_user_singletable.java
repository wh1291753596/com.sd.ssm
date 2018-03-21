package com.sd.service;

import java.util.List;

import com.sd.bean.Admin_user;

public interface IAdmin_user_singletable {

	/*
	 * 单表查询user
	 */
	List<Admin_user> selectAllAdminuser();
}
