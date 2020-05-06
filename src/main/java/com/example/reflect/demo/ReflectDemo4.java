package com.example.reflect.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Title: ReflectDemo
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-02
 */
public class ReflectDemo4 {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
//        getMethodDemo();
        getMethodDemo1();
    }

    private static void getMethodDemo1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<?> clazz = Class.forName("com.example.reflect.bean.Person");

        //获取空参数一般方法
        Method method = clazz.getMethod("paramMethod", String.class, int.class);
        Object object = clazz.newInstance();
        method.invoke(object, "小强", 23);
    }

    private static void getMethodDemo() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> clazz = Class.forName("com.example.reflect.bean.Person");
        Method[] methods = clazz.getMethods(); //获取的都是公有的方法
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        System.out.println("-----------------------");
        //只拿本类中的包括私有的
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method.getName());
        }
        System.out.println("-----------------------");
        //获取空参数一般方法
        Method method = clazz.getMethod("show", null);
        //Object object = clazz.newInstance();
        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, int.class);
        Object o = constructor.newInstance("小王", 25);
        method.invoke(o, null);
    }

}
