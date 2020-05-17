package com.example.proxy.dbroute;

/**
 * Title: OrderService
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-13
 */
public class OrderService implements IOrderService {
    private OrderDao orderDao;

    public OrderService() {
        this.orderDao = new OrderDao();
    }

    @Override
    public int createOrder(Order order) {
        System.out.println("OrderService调用orderDao创建订单");
        return orderDao.insert(order);
    }
}
