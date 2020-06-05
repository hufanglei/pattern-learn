package com.example.observer.blog.one;

/**
 * 观察者接口，定义一个更新的接口给那些在目标发生改变的时候被通知的对象
 */
public interface Observer {
    /**
     * 更新的接口
     */
    public void update(Subject subject);
}
