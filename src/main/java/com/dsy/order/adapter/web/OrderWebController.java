package com.dsy.order.adapter.web;

import com.dsy.order.app.service.OrderAppService;
import com.dsy.order.client.command.OrderAddCmd;
import com.dsy.order.client.query.OrderListQry;
import com.dsy.order.client.vo.OrderVO;
import com.dsy.sunshine.core.Response;
import com.dsy.sunshine.core.ResponseWithData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-04-21
 * @time 10:05
 */
@RestController
public class OrderWebController {

    @Value("${test.txt:NAN}")
    private String testTxt;

    @Autowired
    private OrderAppService orderAppService;

    @PostMapping("addOrder")
    public Response addOrder(@RequestBody @Valid OrderAddCmd cmd){
        orderAppService.addOrder(cmd);
        return Response.buildSuccess();
    }

    @GetMapping("listOrder")
    public ResponseWithData<List<OrderVO>> listOrder(@Valid OrderListQry qry){
        return orderAppService.listOrder(qry);
    }
}