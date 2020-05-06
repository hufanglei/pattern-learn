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
public class ReflectDemo2 {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
//        createObect1();
        createObect2();
    }



    /**
     * 第二种方式： 根据Construcat对象的newInstance方法获取对象
     * 当获取指定名称对应类中的
     *
     * 当获取指定名称对应类中的所体现的对象时，而改对象初始化不适用空参构造该怎么办?
     * 既然是通过指定的构造函数进行对象的初始化
     * 所以应该先获取到该构造函数，通过字节码文件对象即可完成
     * 该方法是: getConstructor(paramterTypes)
     */
    private static void createObect2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String name = "com.example.reflect.bean.Person";
        Class<?> clazz = Class.forName(name);
        Constructor<?> constructor = clazz.getConstructor( String.class, int.class);
        Person p = (Person) constructor.newInstance("小强",18);
        p.show();
    }


    //获取无参的是实例对象
    private static void createObect1() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String name = "com.example.reflect.bean.Person";
        Class<?> clazz = Class.forName(name);
        Object o = clazz.newInstance();
        Person p = (Person) o;
       p.show();
    }


}
