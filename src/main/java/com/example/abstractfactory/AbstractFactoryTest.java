package com.example.abstractfactory;

import com.example.pattern.simplypattern.Icouse;

/**
 * Title: AbstractFactoryTest
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-10
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        ICouseFactory javaCourseFactory = new JavaCourseFactory();
        Icouse javaCourse = javaCourseFactory.createCourse();
        INote javaNote = javaCourseFactory.createNote();
        Ivideo javaVideo = javaCourseFactory.createVideo();
        javaCourse.record();
        javaNote.edit();
        javaVideo.record();

        System.out.println("-------");

        ICouseFactory pythonCourseFactory = new PythonCourseFactory();
        Icouse pythonCourse = pythonCourseFactory.createCourse();
        INote pythonNote = pythonCourseFactory.createNote();
        Ivideo pythonVideo = pythonCourseFactory.createVideo();
        pythonCourse.record();
        pythonNote.edit();
        pythonVideo.record();


    }
}
