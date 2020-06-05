package com.example.observer.blog.three;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义水质监测的目标对象
 */
public abstract class WaterQualitySubject {
    /**
     * 用来保存注册
     */
    protected List<WatcherObserver> observers = new ArrayList<>();
    /**
     * 注册观察者对象
     */
    public void attach(WatcherObserver observer){
        observers.add(observer);
    }
    /**
     * 删除观察者对象
     */
    public void detach(WatcherObserver observer){
        observers.remove(observer);
    }
    /**
     * 通知相应的观察者对象
     */
    public abstract void notifyWathers();
    /**
     * 获取水质污染的级别
     */
    public abstract int getPolluteLevel();

}
