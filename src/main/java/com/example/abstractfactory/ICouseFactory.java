package com.example.abstractfactory;

import com.example.pattern.simplypattern.Icouse;

/**
 * Title: ICouseFactory
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-10
 */
public interface ICouseFactory {
    Icouse createCourse();

    INote createNote();

    Ivideo createVideo();
}
