package com.example.proxy.simpleproxy;

/**
 * Title: Client
 * Description: 测试类
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-13
 */
public class Client {
    public static void main(String[] args) {
        //通过代理对象，执行request方式
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}
