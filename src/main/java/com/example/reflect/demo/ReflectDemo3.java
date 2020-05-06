package com.example.reflect.demo;

import com.example.reflect.bean.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * Title: ReflectDemo
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-02
 */
public class ReflectDemo3 {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
//        createObect1();
        getFieldDemo();
    }

    private static void getFieldDemo() throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> clazz = Class.forName("com.example.reflect.bean.Person");
        Field field = clazz.getDeclaredField("age");
        //对私有字段的访问取消权限检查，暴力访问
        field.setAccessible(true);
        Object object = clazz.newInstance();
        //设置值
        field.set(object, 19);
        Object o = field.get(object);
        System.out.println(o);
    }


}
