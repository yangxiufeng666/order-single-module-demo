package com.dsy.order.infrastructure.gateway.database;

import com.dsy.order.infrastructure.gateway.database.po.OrderItemPO;

import java.util.List;

public interface OrderItemPOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderItemPO record);

    int insertSelective(OrderItemPO record);

    OrderItemPO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderItemPO record);

    int updateByPrimaryKey(OrderItemPO record);

    int insertAll(List<OrderItemPO> itemPOList);
}