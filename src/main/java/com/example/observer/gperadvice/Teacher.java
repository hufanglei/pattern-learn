package com.example.observer.gperadvice;

import java.util.Observable;
import java.util.Observer;

/**
 * Title: Teacher
 * Description: 观察者
 *
 * @author hfl
 * @version V1.0
 * @date 2020-06-03
 */
public class Teacher implements Observer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        GPer gper = (GPer)o;
        Question question = (Question)arg;
        System.out.println("===============================");
        System.out.println(name + "老师，你好！\n" +
                "您收到了一个来自“" + gper.getName() + "”的提问，希望您解答，问题内容如下：\n" +
                question.getContent() + "\n" +
                "提问者：" + question.getUserName());
    }
}
