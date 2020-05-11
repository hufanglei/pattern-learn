package com.example.sington.register;

/**
 * Title: ThreadLocalSingleton
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-12
 */
public class ThreadLocalSingleton {


    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>() {
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    private ThreadLocalSingleton() {
    }

    public static ThreadLocalSingleton getInstance() {
        return threadLocalInstance.get();
    }
}
