package com.example.delegate.simple;

/**
 * Title: DelegateTest
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-17
 */
public class DelegateTest {
    public static void main(String[] args) {
        new Boss().command("登录", new Leader());
        new Boss().command("加密", new Leader());
    }
}
