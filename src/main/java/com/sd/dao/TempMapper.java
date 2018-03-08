package com.sd.dao;

import com.sd.bean.Temp;
import com.sd.bean.TempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TempMapper {
    long countByExample(TempExample example);

    int deleteByExample(TempExample example);

    int deleteByPrimaryKey(String name);

    int insert(Temp record);

    int insertSelective(Temp record);

    List<Temp> selectByExample(TempExample example);

    int updateByExampleSelective(@Param("record") Temp record, @Param("example") TempExample example);

    int updateByExample(@Param("record") Temp record, @Param("example") TempExample example);
}