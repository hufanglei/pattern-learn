package com.example.reflect.demo;

import com.example.reflect.bean.Person;

/**
 * Title: ReflectDemo
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-02
 */
public class ReflectDemo {

    public static void main(String[] args) throws ClassNotFoundException {
//        test1();
//        test2();
          test3();
    }

    /**
     * 方式3
     * 包名 class
     * 只要通过给定的类的 字符串名称就可获取该类，更为扩展
     * 可是用class类中的方法完成, 该方法就是forName
     */
    private static void test3() throws ClassNotFoundException {
        Class<?> classz = Class.forName("com.example.reflect.bean.Person");
        System.out.println(classz);
        Class<?> classz2 = Class.forName("com.example.reflect.bean.Person");
        System.out.println(classz2);
        System.out.println(classz == classz2);
    }

    /**
     * 方式2:
     * 类名.class
     * 任何数据类型都具备一个静态的属性，class类来获取其对应的class对象
     * 相对简单，但是还是要明确用到类中的静态成员
     * 还是不够扩展
     */
    private static void test2() {
        Class<?> classz = Person.class;
        System.out.println(classz);
        Class<?> classz2 = Person.class;
        System.out.println(classz2);
        System.out.println(classz==classz2);
    }

    /**
     * 方式1:
     * getClass()
     * Object类中的getClass()方法。
     * 这种方式，必须要明确具体的类并创建对象，麻烦
     */
    private static void test1() {
        Person person = new Person();
        Class<?> classz = person.getClass();
        System.out.println(classz);
        Class<?> classz2 = person.getClass();
        System.out.println(classz2);
        System.out.println(classz == classz2);
    }


}
