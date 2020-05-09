package com.example.abstractfactory;
import com.example.pattern.simplypattern.Icouse;
import com.example.pattern.simplypattern.PythonCourse;

/**
 * Title: JavaCourseFactory
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-10
 */
public class PythonCourseFactory implements ICouseFactory {
    @Override
    public Icouse createCourse() {
        return new PythonCourse();
    }

    @Override
    public INote createNote() {
        return new PythonNote();
    }

    @Override
    public Ivideo createVideo() {
        return new PythonVideo();
    }
}
