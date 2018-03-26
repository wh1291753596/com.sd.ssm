package com.sd.dao;

import com.sd.bean.Get;
import com.sd.bean.GetExample;
import com.sd.bean.Good;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GetMapper {
	long countByExample(GetExample example);

	int deleteByExample(GetExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Get record);

	int insertSelective(Get record);

	List<Get> selectByExample(GetExample example);

	Get selectByPrimaryKey(Integer id);

	Get selectByTime(Date creatTime);

	int updateByExampleSelective(@Param("record") Get record, @Param("example") GetExample example);

	int updateByExample(@Param("record") Get record, @Param("example") GetExample example);

	int updateByPrimaryKeySelective(Get record);

	int updateByPrimaryKey(Get record);
}