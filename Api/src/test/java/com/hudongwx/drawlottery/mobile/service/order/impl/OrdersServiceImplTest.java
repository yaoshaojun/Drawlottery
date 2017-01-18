package com.hudongwx.drawlottery.mobile.service.order.impl;

import com.hudongwx.drawlottery.mobile.TestBaseMapper;
import com.hudongwx.drawlottery.mobile.entitys.CommodityAmount;
import com.hudongwx.drawlottery.mobile.entitys.Orders;
import com.hudongwx.drawlottery.mobile.service.order.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by 11 on 2017/1/14.
 */
public class OrdersServiceImplTest extends TestBaseMapper {
    @Autowired
    IOrdersService service;
    @Test
    public void testPay() throws Exception {
        Long accountId = 10000L;
        Orders orders = new Orders();
        orders.setUserAccountId(accountId);
        orders.setPayModeId(1);
        orders.setRedPacketId(4L);
        orders.setPrice(100);
        orders.setSubmitDate(new Date().getTime());
        List<CommodityAmount> list = new ArrayList<>();
        CommodityAmount commodityAmount = new CommodityAmount();
        commodityAmount.setCommodityId(76L);
        commodityAmount.setAmount(60);
        list.add(commodityAmount);
        service.pay(accountId, orders, list);
    }

}