package com.dsy.order.client.command;

import com.dsy.sunshine.core.Command;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-12
 * @time 9:28
 */
@Data
public class OrderAddCmd extends Command {


    @NotNull
    @Valid
    private Consignee consignee;

    @NotNull
    @Valid
    private List<GoodsInfo> goods;

    @Data
    public static class GoodsInfo{
        int goodsId;
        @NotEmpty(message = "商品名称不能为空")
        String goodsName;
        int goodsQuantity;
        int goodsPrice;
    }

    @Data
    public static class Consignee{
        @NotEmpty(message = "收货人不能为空")
        String name;
        @NotEmpty(message = "收货电话不能为空")
        String mobile;
        @NotEmpty(message = "省不能为空")
        String province;
        @NotEmpty(message = "市不能为空")
        String city;
        @NotEmpty(message = "区县不能为空")
        String county;
        @NotEmpty(message = "详细地址不能为空")
        String detailAddress;
    }

}
