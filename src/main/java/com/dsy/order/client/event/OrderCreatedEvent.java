package com.dsy.order.client.event;

import com.dsy.sunshine.core.event.AbstractEvent;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-14
 * @time 9:44
 */
public class OrderCreatedEvent extends AbstractEvent {
    public OrderCreatedEvent(String id) {
        super(id);
    }
}
