package com.example.sington.lazy.test;

import com.example.sington.lazy.LazyDoubleCheckSington;
import com.example.sington.lazy.LazySimplySington;
import com.example.sington.register.ThreadLocalSingleton;

/**
 * Title: ExectorThread
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-10
 */
public class ExectorThread implements Runnable {
    @Override
    public void run() {
//        LazySimplySington instance = LazySimplySington.getInstance();
//        LazyDoubleCheckSington instance = LazyDoubleCheckSington.getInstance();
        ThreadLocalSingleton instance = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+" ---"+instance);
        ThreadLocalSingleton instance2 = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+" ---"+instance2);
        ThreadLocalSingleton instance3 = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+" ---"+instance3);
        ThreadLocalSingleton instance4 = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+" ---"+instance4);
        ThreadLocalSingleton instance5 = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+" ---"+instance5);

        System.out.println(Thread.currentThread().getName()+" ---"+instance);
    }
}
