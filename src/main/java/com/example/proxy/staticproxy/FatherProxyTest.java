package com.example.proxy.staticproxy;

/**
 * Title: FatherProxyTest
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-13
 */
public class FatherProxyTest {
    public static void main(String[] args) {
        final Father father = new Father(new Son());
        father.findLove();
    }
}
