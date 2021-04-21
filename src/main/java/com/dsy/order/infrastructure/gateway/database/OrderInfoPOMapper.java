package com.dsy.order.infrastructure.gateway.database;

import com.dsy.order.client.query.OrderListQry;
import com.dsy.order.infrastructure.gateway.database.po.OrderInfoPO;

import java.util.List;

public interface OrderInfoPOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderInfoPO record);

    int insertSelective(OrderInfoPO record);

    OrderInfoPO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderInfoPO record);

    int updateByPrimaryKey(OrderInfoPO record);

    List<OrderInfoPO> listOrder(OrderListQry qry);
}