package com.example.observer.gperadvice;

import java.util.Observable;

/**
 * Title: GPer
 * Description: JDK提供的一种观察者的实现方式，被观察者
 *
 * @author hfl
 * @version V1.0
 * @date 2020-06-03
 */
public class GPer extends Observable {
    private String name = "GPer生态圈";
    private static GPer gper = null;

    private GPer() {
    }

    public static GPer getInstance(){
        if(null == gper){
            gper = new GPer();
        }
        return gper;
    }

    public void publishQuestion(Question question){
        System.out.println(question.getUserName() + "在" + this.name + "上提交了一个问题。");
        setChanged();
        notifyObservers(question);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
