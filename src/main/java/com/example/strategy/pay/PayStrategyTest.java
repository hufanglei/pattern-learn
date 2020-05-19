package com.example.strategy.pay;

import com.example.strategy.pay.payport.PayStrategy;
import org.springframework.beans.factory.support.InstantiationStrategy;
import org.springframework.core.io.Resource;

import java.util.Arrays;
import java.util.TreeMap;

/**
 * .
 */
public class PayStrategyTest {

    public static void main(String[] args) {

        //省略把商品添加到购物车，再从购物车下单
        //直接从点单开始
        Order order = new Order("1","20180311001000009",324.45);

        //开始支付，选择微信支付、支付宝、银联卡、京东白条、财付通
        //每个渠道它支付的具体算法是不一样的
        //基本算法固定的
        MsgResult pay = order.pay(PayStrategy.ALI_PAY);
//        MsgResult pay = order.pay(PayStrategy.JD_PAY);
        //这个值是在支付的时候才决定用哪个值
//        System.out.println(order.pay(PayStrategy.ALI_PAY));
        System.out.println(pay);


        //java中的应用
//        Arrays.sort();
        //Resource
//        InstantiationStrategy
    }

}
