package com.example.reflect.bean;

import com.example.reflect.demo.FillCommentEnum;
import com.example.reflect.annotation.RecordTemplateAnnotation;

/**
 * Title: Person
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-02
 */
public class Person {
    @RecordTemplateAnnotation(rowNo = 6, columnNo = 2, comment = FillCommentEnum.EMPTY, name = "车辆颜色")
    private int age;
    private String name;

    public Person() {
        super();
    }

    public Person(String name,int age) {
        this.age = age;
        this.name = name;
    }

    public void show() {
        System.out.println(name + "...show run..." + age);
    }

    public void method() {
        System.out.println(" method run ");
    }

    public void paramMethod(String name,int age) {
        System.out.println(name + "...show run..." + age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
