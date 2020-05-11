package com.example;

import com.example.sington.lazy.test.ExectorThread;
import com.example.sington.register.ThreadLocalSingleton;

/**
 * Title: ThreadLocalSingletonTest
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-12
 */
public class ThreadLocalSingletonTest {
    public static void main(String[] args) {

        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("End");

    }
}
