package com.dsy.order.app.handler;

import com.dsy.order.client.event.OrderCreatedEvent;
import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.Subscribe;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-14
 * @time 9:26
 */
@Component
@Slf4j
public class OrderCreatedHandler {
    private AsyncEventBus asyncEventBus;

    public OrderCreatedHandler(AsyncEventBus asyncEventBus) {
        this.asyncEventBus = asyncEventBus;
    }

    @Subscribe
    public void orderCreated(OrderCreatedEvent event){
         log.info("消费订单创建的事件：{}",event);
    }

}
