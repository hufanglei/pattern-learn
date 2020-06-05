package com.example.observer.blog.two;

public class TestObserver {

    public static void main(String[] args) {
        //主题
        ConcreteSubject concreteSubject = new ConcreteSubject();
        //观察者
        CartoonObserver cartoonObserver = new CartoonObserver();
        NBAObserver nbaObserver = new NBAObserver();
        //添加观察者
        concreteSubject.addObserver(cartoonObserver);
        concreteSubject.addObserver(nbaObserver);
       //发布消息通知
        concreteSubject.notifyAllObserver("老师来了");
    }

}
