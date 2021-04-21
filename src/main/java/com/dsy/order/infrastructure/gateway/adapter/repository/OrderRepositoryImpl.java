package com.dsy.order.infrastructure.gateway.adapter.repository;

import com.dsy.order.infrastructure.gateway.database.OrderInfoPOMapper;
import com.dsy.order.infrastructure.gateway.database.OrderItemPOMapper;
import com.dsy.order.infrastructure.gateway.database.po.OrderInfoPO;
import com.dsy.order.infrastructure.gateway.database.po.OrderItemPO;
import com.dsy.order.infrastructure.gateway.port.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-04-21
 * @time 9:35
 */
@Component
public class OrderRepositoryImpl implements OrderRepository {

    @Autowired
    private OrderInfoPOMapper orderPOMapper;
    @Autowired
    private OrderItemPOMapper orderItemPOMapper;

    @Override
    public void addOrder(OrderInfoPO orderPO, List<OrderItemPO> itemPOList) {
        orderPOMapper.insert(orderPO);
        orderItemPOMapper.insertAll(itemPOList);
    }
}
