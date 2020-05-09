package com.example.abstractfactory;
import com.example.pattern.simplypattern.Icouse;
import com.example.pattern.simplypattern.JavaCourse;

/**
 * Title: JavaCourseFactory
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-10
 */
public class JavaCourseFactory implements ICouseFactory {
    @Override
    public Icouse createCourse() {
        return new JavaCourse();
    }

    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public Ivideo createVideo() {
        return new JavaVideo();
    }
}
