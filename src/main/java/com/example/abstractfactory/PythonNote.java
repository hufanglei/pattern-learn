package com.example.abstractfactory;

/**
 * Title: JavaNote
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-10
 */
public class PythonNote implements INote {
    @Override
    public void edit() {
        System.out.println("提供python笔记");
    }
}
