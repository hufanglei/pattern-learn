package com.example.observer.blog.one;

public class Test {
    public static void main(String[] args) {
        //观察者
        Observer concreteObserver1 = new ConcreteObserver();
        Observer concreteObserver2 = new ConcreteObserver();
        //目标对象 即被观察者 目标可以有多个，此demo通过 state区分
        ConcreteSubject subject1 = new ConcreteSubject();
        //注册观察者
        subject1.attach(concreteObserver1);
        subject1.attach(concreteObserver2);
//        ConcreteSubject subject2 = new ConcreteSubject();
//        //注册观察者
//        subject2.attach(concreteObserver1);
//        subject2.attach(concreteObserver2);
        //发出通知
        subject1.setSubjectState("通知1：已经下发了");
//        System.out.println("===换一个主题======");
//        subject2.setSubjectState("通知2：已经下发了");
    }
}
