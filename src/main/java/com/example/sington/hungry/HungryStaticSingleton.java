package com.example.sington.hungry;

/**
 * Title: HungrySingleton
 * Description: 饿汉式单例模式 --- 静态代码块
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-10
 */
public class HungryStaticSingleton {
    private static final HungryStaticSingleton hungrySington;

    static {
        hungrySington = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {
    }

    public static HungryStaticSingleton getInstance() {
        return hungrySington;
    }
}
