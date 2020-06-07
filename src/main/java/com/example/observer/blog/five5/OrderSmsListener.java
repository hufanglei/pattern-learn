package com.example.observer.blog.five5;


import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class OrderSmsListener implements ApplicationListener<OrderEvent> {
    @Override
    public void onApplicationEvent(OrderEvent orderEvent) {
        System.out.println("orderSmsListener receive event from " + orderEvent.getSource());
    }
}