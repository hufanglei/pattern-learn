package com.example.factorymethod2;

import com.example.pattern.simplypattern.Icouse;

/**
 * Title: FactoryMethodTest
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-09
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        PythonCourseFactory pythonCourseFactory = new PythonCourseFactory();
        Icouse couse = pythonCourseFactory.create();
        couse.record();
        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        Icouse couse1 = javaCourseFactory.create();
        couse1.record();
    }
}
