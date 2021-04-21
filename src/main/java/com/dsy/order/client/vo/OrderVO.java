package com.dsy.order.client.vo;

import com.dsy.sunshine.core.DTO;
import lombok.Data;

import java.util.Date;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-13
 * @time 11:44
 */
@Data
public class OrderVO extends DTO {

    private Integer orderId;

    private String orderSn;

    private Long totalPrice;

    private Date createTime;
}
