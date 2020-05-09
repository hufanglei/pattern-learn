package com.example.pattern.simplypattern;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Title: ICourseFactory
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-07
 */
public class CourseFactory {
    public  Icouse getCourse3(String name) {
        //写法1
        if ("java".equals(name)) {
            return new JavaCourse();
        }
        return null;
    }

    public  Icouse getCourse2(String className) {
        //写法2:
        Class<?> clazz = null;
        try {
//          clazz = Class.forName("com.example.pattern.PythonCourse.JavaCourse");
            clazz = Class.forName(className);
            Object instance = clazz.newInstance();
            return (Icouse) instance;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public  Icouse getCourse(Class clazz) {
        try {
            if (null != clazz) {
                return (Icouse) clazz.newInstance();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
