package com.dsy.order.app.executor.query;

import com.dsy.order.client.query.OrderListQry;
import com.dsy.order.client.vo.OrderVO;
import com.dsy.order.infrastructure.gateway.database.OrderInfoPOMapper;
import com.dsy.order.infrastructure.gateway.database.po.OrderInfoPO;
import com.dsy.order.infrastructure.util.BeanConvertUtils;
import com.dsy.sunshine.core.ResponseWithData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-12
 * @time 14:25
 */
@Component
public class OrderListQryExe {

    @Autowired
    private OrderInfoPOMapper orderPOMapper;

    public ResponseWithData<List<OrderVO>> executor(OrderListQry qry){

        List<OrderInfoPO> list = orderPOMapper.listOrder(qry);
        //convert to view object
        List<OrderVO> orderVOList = BeanConvertUtils.convertListTo(list , OrderVO::new, ((s, t) -> t.setOrderId(s.getId())));

        return ResponseWithData.buildSuccess().setData(orderVOList);

    }

}
