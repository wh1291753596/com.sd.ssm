package com.sd.service.imp;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.sd.service.IAdminUserFunctionManage;
import com.sd.service.SqlSessionTool;

public class AdminUserFunctionManage implements IAdminUserFunctionManage {

	@Override
	public List<Integer> SelectAllJurisdictionByAdminUserId(int adminUserId) {
		
		SqlSession session = SqlSessionTool.CreateSqlSession();
		List<Integer> funcIds=session.selectList("com.sd.dao.AdminUserFunctionManageMapper.selectAllJurisdictionByAdminUserId", adminUserId);
		session.commit();
		session.close();
		
		return funcIds;
	}

	@Override
	public int DenyAllJurisdictionByAdminUserId(int adminUserId) {
		SqlSession session = SqlSessionTool.CreateSqlSession();
		int count = session.update("com.sd.dao.AdminUserFunctionManageMapper.DenyAllJurisdictionByAdminUserId", adminUserId);
		session.commit();
		session.close();
		
		return count;
	}
}
