package com.example;

import com.example.sington.lazy.LazyInnerClassSington;

import java.lang.reflect.Constructor;

/**
 * Title: LazyInnerClassSingtonTest
 * Description: 反射破坏单例
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-11
 */
public class LazyInnerClassSingtonTest {
    public static void main(String[] args) {
        try {
            //反射，破坏了单例
            Class<?> clazz = LazyInnerClassSington.class;
            Constructor<?> c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            Object o = c.newInstance();
            Object o2 = c.newInstance();
            System.out.println(o == o2);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
