package com.dsy.order.app.converter;

import com.dsy.order.client.command.OrderAddCmd;
import com.dsy.order.domain.model.Consignee;
import com.dsy.order.domain.model.Order;
import com.dsy.order.domain.model.OrderItem;
import com.dsy.order.infrastructure.util.BeanConvertUtils;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.UUID;


/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-13
 * @time 15:30
 */
public class AppOrderConverter {

    public static Order toEntity(OrderAddCmd cmd){
        Consignee consignee = new Consignee();
        BeanUtils.copyProperties(cmd.getConsignee() , consignee);
        List<OrderItem> orderItems = BeanConvertUtils.convertListTo(cmd.getGoods(), OrderItem::new, (s, t) -> {});
        return new Order(UUID.randomUUID().toString(), orderItems , consignee);
    }

}
