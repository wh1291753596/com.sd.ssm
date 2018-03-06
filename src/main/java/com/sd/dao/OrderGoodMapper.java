package com.sd.dao;

import com.sd.bean.OrderGood;
import com.sd.bean.OrderGoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderGoodMapper {
    long countByExample(OrderGoodExample example);

    int deleteByExample(OrderGoodExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderGood record);

    int insertSelective(OrderGood record);

    List<OrderGood> selectByExample(OrderGoodExample example);

    OrderGood selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderGood record, @Param("example") OrderGoodExample example);

    int updateByExample(@Param("record") OrderGood record, @Param("example") OrderGoodExample example);

    int updateByPrimaryKeySelective(OrderGood record);

    int updateByPrimaryKey(OrderGood record);
}