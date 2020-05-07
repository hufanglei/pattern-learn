package com.example.pattern.simplypattern;

/**
 * Title: Test
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-07
 *
 */
public class Test {
    public static void main(String[] args) {
        //原始做法
//        Icouse icouse = new JavaCourse();
        //简单工厂写法1:
        Icouse icouse3 = CourseFactory.getCourse3("java");
        //简单工厂写法2---反射写法
        Icouse icouse2 = CourseFactory.getCourse2("com.example.pattern.simplypattern.JavaCourse");
        //简单工厂写法3---反射写法2
        Icouse icouse = CourseFactory.getCourse(JavaCourse.class);
        icouse.record();
    }
}
