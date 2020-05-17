package com.example.proxy.simpleproxy;

/**
 * Title: RealSubject
 * Description: 真正的对象
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-13
 */
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("real service is called");
    }
}
