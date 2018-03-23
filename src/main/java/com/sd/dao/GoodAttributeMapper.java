package com.sd.dao;

import com.sd.bean.GoodAttribute;
import com.sd.bean.GoodAttributeExample;
import com.sd.bean.GoodAttributeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodAttributeMapper {
    long countByExample(GoodAttributeExample example);

    int deleteByExample(GoodAttributeExample example);

    int deleteByPrimaryKey(GoodAttributeKey key);

    int insert(GoodAttribute record);

    int insertSelective(GoodAttribute record);

    List<GoodAttribute> selectByExample(GoodAttributeExample example);

    GoodAttribute selectByPrimaryKey(GoodAttributeKey key);

    int updateByExampleSelective(@Param("record") GoodAttribute record, @Param("example") GoodAttributeExample example);

    int updateByExample(@Param("record") GoodAttribute record, @Param("example") GoodAttributeExample example);

    int updateByPrimaryKeySelective(GoodAttribute record);

    int updateByPrimaryKey(GoodAttribute record);
}