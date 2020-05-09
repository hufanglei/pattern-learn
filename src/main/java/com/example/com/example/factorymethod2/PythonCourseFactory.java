package com.example.com.example.factorymethod2;

import com.example.pattern.simplypattern.Icouse;
import com.example.pattern.simplypattern.PythonCourse;

/**
 * Title: PythonCourseFactory
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-09
 */
public class PythonCourseFactory extends ICourseFactory {
    @Override
    public Icouse create() {
        return new PythonCourse();
    }
}
