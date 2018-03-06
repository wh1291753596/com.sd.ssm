package com.sd.dao;

import com.sd.bean.Send;
import com.sd.bean.SendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SendMapper {
    long countByExample(SendExample example);

    int deleteByExample(SendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Send record);

    int insertSelective(Send record);

    List<Send> selectByExample(SendExample example);

    Send selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Send record, @Param("example") SendExample example);

    int updateByExample(@Param("record") Send record, @Param("example") SendExample example);

    int updateByPrimaryKeySelective(Send record);

    int updateByPrimaryKey(Send record);
}