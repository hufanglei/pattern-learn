package com.example.proxy.dbroute.proxy;


import com.example.proxy.dbroute.IOrderService;
import com.example.proxy.dbroute.Order;
import com.example.proxy.dbroute.db.DynamicDataSourceEntry;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 静态代理对象
 *
 */
public class OrderServiceStaticProxy implements IOrderService {
    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    private IOrderService orderService;

    public OrderServiceStaticProxy(IOrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public int createOrder(Order order) {
        before();
        Long time = order.getCreateTime();
        Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));
        System.out.println("静态代理类自动分配到【DB_" + dbRouter + "】数据源处理数据");
        DynamicDataSourceEntry.set(dbRouter);

        this.orderService.createOrder(order);
        DynamicDataSourceEntry.restore();
        after();
        return 0;
    }

    public void before(){
        System.out.println("Proxy before method.");
    }
    public void after(){
        System.out.println("Proxy after method.");
    }
}
