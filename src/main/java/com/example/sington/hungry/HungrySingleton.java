package com.example.sington.hungry;

/**
 * Title: HungrySingleton
 * Description: 饿汉式单例模式
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-10
 */
public class HungrySingleton {
    private static final HungrySingleton hungrySington = new HungrySingleton();

    private HungrySingleton() {
    }
    public static HungrySingleton getInstance(){
        return hungrySington;
    }
}
