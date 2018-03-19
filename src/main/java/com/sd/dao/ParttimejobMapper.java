package com.sd.dao;

import com.sd.bean.Parttimejob;
import com.sd.bean.ParttimejobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParttimejobMapper {
    long countByExample(ParttimejobExample example);

    int deleteByExample(ParttimejobExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Parttimejob record);

    int insertSelective(Parttimejob record);

    List<Parttimejob> selectByExample(ParttimejobExample example);

    List<Parttimejob> selectAll();
    
    Parttimejob selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Parttimejob record, @Param("example") ParttimejobExample example);

    int updateByExample(@Param("record") Parttimejob record, @Param("example") ParttimejobExample example);

    int updateByPrimaryKeySelective(Parttimejob record);

    int updateByPrimaryKey(Parttimejob record);
}