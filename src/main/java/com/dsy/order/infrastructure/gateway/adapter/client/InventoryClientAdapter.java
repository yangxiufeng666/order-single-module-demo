package com.dsy.order.infrastructure.gateway.adapter.client;

import com.dsy.order.infrastructure.gateway.port.client.InventoryClient;
import com.dsy.sunshine.core.Response;
import org.springframework.stereotype.Component;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-04-21
 * @time 9:34
 */
@Component
public class InventoryClientAdapter implements InventoryClient {
    @Override
    public Response check() {
        return Response.buildSuccess();
    }
}
