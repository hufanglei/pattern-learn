package com.example.proxy.simpleproxy;

/**
 * Title: Proxy
 * Description: 代理对象
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-13
 */
public class Proxy implements Subject{
    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }
    public void before() {
        System.out.println("called before request().");
    }
    public void after() {
        System.out.println("called after request().");
    }
    @Override
    public void request() {
        before();
        subject.request();
        after();
    }





}
