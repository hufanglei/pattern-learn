package com.example.proxy.dbroute;

/**
 * Title: OrderDao
 * Description: 持久化层
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-13
 */
public class OrderDao {
    public int insert(Order order){
        System.out.println("OrderDao 创建Order 成功!");
        return 1;
    }
}
