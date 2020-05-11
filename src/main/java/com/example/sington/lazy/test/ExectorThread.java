package com.example.sington.lazy.test;

import com.example.sington.lazy.LazyDoubleCheckSington;
import com.example.sington.lazy.LazySimplySington;

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
        LazyDoubleCheckSington instance = LazyDoubleCheckSington.getInstance();
        System.out.println(Thread.currentThread().getName()+" ---"+instance);
    }
}
