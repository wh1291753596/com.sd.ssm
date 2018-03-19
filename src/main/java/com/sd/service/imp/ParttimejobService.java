package com.sd.service.imp;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.sd.bean.Parttimejob;
import com.sd.service.IparttimejobService;
import com.sd.service.SqlSessionTool;

public class ParttimejobService implements IparttimejobService {

	@Override
	public List<Parttimejob> select()
	{
		SqlSession session = SqlSessionTool.CreateSqlSession();
		List<Parttimejob> parttimejobs=session.selectList("com.sd.dao.ParttimejobMapper.selectAll");
		session.commit();
		session.close();
		return parttimejobs;
	}
}
