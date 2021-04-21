package com.dsy.order.infrastructure.config;

import com.google.common.eventbus.AsyncEventBus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.Executors;

/**
 * @author Mr.Yangxiufeng
 **/
@Configuration
public class AsyncEventBusConfig {
    @Bean
    public AsyncEventBus asyncEventBus(){
        return new AsyncEventBus(Executors.newFixedThreadPool(5));
    }
}
