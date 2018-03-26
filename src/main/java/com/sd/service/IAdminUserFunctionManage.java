package com.sd.service;

import java.util.List;

import com.sd.bean.Admin_user;

public interface IAdminUserFunctionManage {
	
	/*
	 * 查询指定系统用户的所有角的权限并集 
	 * 返回参数为权限id集合
	 */
	List<Integer> SelectAllJurisdictionByAdminUserId(int adminUserId);
	
	/*
	 * 删除单个用户所有权限  采用flag形式进行假删 
	 */
	int DenyAllJurisdictionByAdminUserId(int adminUserId);
}
