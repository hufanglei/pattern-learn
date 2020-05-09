package com.example.factorymethod2;

import com.example.pattern.simplypattern.Icouse;

/**
 * Title: ICourseFactory
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-07
 */
public abstract class ICourseFactory {
    public void precreate(){
        System.out.println("提前做一些操作");
    }
    abstract Icouse create();
}
