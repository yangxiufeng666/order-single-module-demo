package com.dsy.order.infrastructure.gateway.port.publisher;

import com.dsy.sunshine.core.event.AbstractEvent;
import com.dsy.sunshine.core.event.EventPublisher;
import com.google.common.eventbus.AsyncEventBus;
import org.springframework.stereotype.Component;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-14
 * @time 9:16
 */
@Component
public class InnerEventPublisher implements EventPublisher {

    private AsyncEventBus asyncEventBus;

    public InnerEventPublisher(AsyncEventBus asyncEventBus) {
        this.asyncEventBus = asyncEventBus;
    }

    @Override
    public void publish(AbstractEvent event) {
        asyncEventBus.post(event);
    }
}
