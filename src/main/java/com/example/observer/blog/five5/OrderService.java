package com.example.observer.blog.five5;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ApplicationContext applicationContext;


    public void order() {
        applicationContext.publishEvent(new OrderEvent("orderService"));
    }
}