package com.example.observer.blog.one;

//具体观察者对象，实现更新的方法，使用自身的状态和
public class ConcreteObserver implements Observer {

    @Override
    public void update(Subject subject) {
        //具体的实现
        //这里可能需要更新观察者的状态，使其与目标的状态保持一致
        String message = ((ConcreteSubject) subject).getSubjectState();
        System.out.println("收到一通知: 获取到的状态是: " + message);
    }

}
