package com.dsy.order.domain.ability;

import com.dsy.order.client.event.OrderCreatedEvent;
import com.dsy.order.domain.converter.OrderConverter;
import com.dsy.order.domain.exception.NotEnoughInventoryException;
import com.dsy.order.domain.model.Order;
import com.dsy.order.infrastructure.gateway.port.client.InventoryClient;
import com.dsy.order.infrastructure.gateway.port.repository.OrderRepository;
import com.dsy.sunshine.core.DomainService;
import com.dsy.sunshine.core.Response;
import com.dsy.sunshine.core.event.EventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-12
 * @time 14:19
 */
@Component
public class OrderDomainService implements DomainService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private InventoryClient inventoryClient;

    @Autowired
    private EventPublisher eventPublisher;

    public void addOrder(Order order){
        Response response = inventoryClient.check();
        if ( !response.isSuccess() ){
            throw new NotEnoughInventoryException("库存不足");
        }
        orderRepository.addOrder(OrderConverter.toDataObject(order) , OrderConverter.toItemDataObject(order));

        OrderCreatedEvent orderCreatedEvent = new OrderCreatedEvent(UUID.randomUUID().toString());
        eventPublisher.publish(orderCreatedEvent);
    }

}
