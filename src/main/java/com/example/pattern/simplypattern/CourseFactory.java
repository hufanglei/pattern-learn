package com.example.pattern.simplypattern;

/**
 * Title: CourseFactory
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-07
 */
public class CourseFactory {
    public static Icouse getCourse(String name){
        if ("java".equals(name)){
            return new JavaCourse();
        }
        return null;
    }
}
