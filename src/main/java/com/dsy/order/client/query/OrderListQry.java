package com.dsy.order.client.query;

import com.dsy.sunshine.core.Query;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-12
 * @time 14:37
 */
@Data
public class OrderListQry extends Query {
    @NotNull(message = "页码不能为空")
    private Integer pageNum;
    @NotNull(message = "每页条数不能为空")
    private Integer pageSize;
}
