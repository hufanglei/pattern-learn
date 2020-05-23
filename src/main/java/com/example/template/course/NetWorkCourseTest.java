package com.example.template.course;

/**
 * Title: NetWorkCourseTest
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-20
 */
public class NetWorkCourseTest {
    public static void main(String[] args) {
        System.out.println("---检查java作业--");
        NetWorkCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();
        System.out.println("---检查大数据作业--");
        BigDataCource bigDataCource = new BigDataCource(true);
        bigDataCource.createCourse();
    }
}
