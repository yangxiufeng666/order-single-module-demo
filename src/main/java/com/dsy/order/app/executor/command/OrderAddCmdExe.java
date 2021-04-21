package com.dsy.order.app.executor.command;

import com.dsy.order.app.converter.AppOrderConverter;
import com.dsy.order.client.command.OrderAddCmd;
import com.dsy.order.domain.ability.OrderDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-12
 * @time 9:58
 */
@Component
public class OrderAddCmdExe {

    @Autowired
    private OrderDomainService orderDomainService;

    public void executor(OrderAddCmd cmd){
         orderDomainService.addOrder(AppOrderConverter.toEntity(cmd));
    }

}
