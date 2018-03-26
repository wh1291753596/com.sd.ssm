package com.sd.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.sd.service.IAdminUserFunctionManage;
import com.sd.service.imp.AdminUserFunctionManage;

public class TestAdminUserFunctionManageService {

	@Test
	public void test() {
		//先测试单个用户权限查询
		IAdminUserFunctionManage adminUserFunctionManage = new AdminUserFunctionManage();
		List<Integer> funcIds=adminUserFunctionManage.SelectAllJurisdictionByAdminUserId(1);
		System.out.println("查询到所有权限id如下");
		for(Integer id : funcIds) {
			System.out.print(id+"  ");
		}
		
		System.out.println("");
		
		//测试用户权限删除
		int count = adminUserFunctionManage.DenyAllJurisdictionByAdminUserId(1);
		if(count==1) {
			System.out.println("用户1权限删除操作成功！");
		}
		else {
			System.out.println("用户1权限删除操作失败！");
		}
		
	}

}
