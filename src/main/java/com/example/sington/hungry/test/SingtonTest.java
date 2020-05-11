package com.example.sington.hungry.test;

import com.example.sington.hungry.HungrySingleton;

/**
 * Title: SingtonTest
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-10
 */
public class SingtonTest {
    public static void main(String[] args) {
        HungrySingleton instance = HungrySingleton.getInstance();
        HungrySingleton instance2 = HungrySingleton.getInstance();
        System.out.println(instance);
        System.out.println(instance2);
        System.out.println(instance == instance2);
    }
}
