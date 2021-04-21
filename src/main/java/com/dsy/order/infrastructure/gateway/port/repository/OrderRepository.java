package com.dsy.order.infrastructure.gateway.port.repository;

import com.dsy.order.infrastructure.gateway.database.po.OrderInfoPO;
import com.dsy.order.infrastructure.gateway.database.po.OrderItemPO;

import java.util.List;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-13
 * @time 14:47
 */
public interface OrderRepository {

    void addOrder(OrderInfoPO orderPO, List<OrderItemPO> itemPOList);

}
