package com.example.sington.lazy.test;

/**
 * Title: LazySimplySingtonTest
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-10
 */
public class LazySimplySingtonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("Exctor End");
    }
}
