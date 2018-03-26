package com.sd.dao;

import com.sd.bean.Order_status;
import com.sd.bean.Order_statusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Order_statusMapper {
    long countByExample(Order_statusExample example);

    int deleteByExample(Order_statusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Order_status record);

    int insertSelective(Order_status record);

    List<Order_status> selectByExample(Order_statusExample example);

    Order_status selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Order_status record, @Param("example") Order_statusExample example);

    int updateByExample(@Param("record") Order_status record, @Param("example") Order_statusExample example);

    int updateByPrimaryKeySelective(Order_status record);

    int updateByPrimaryKey(Order_status record);
}