package com.dsy.order.domain.model;

import com.dsy.sunshine.core.Entity;
import lombok.Data;

import java.util.List;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-12
 * @time 10:19
 */
@Data
public class Order extends Entity {

    /**
     * 订单号
     */
    private String orderSn;
    /**
     * 订单金额
     */
    private int totalPrice;

    private List<OrderItem> orderItems;

    private Consignee consignee;

    public Order(String orderSn, List<OrderItem> orderItems, Consignee consignee) {
        this.orderSn = orderSn;
        this.orderItems = orderItems;
        this.consignee = consignee;
        calculateTotalPrice();
    }
    private void calculateTotalPrice(){
        orderItems.forEach((item)-> totalPrice += item.goodsPrice);
    }
}
