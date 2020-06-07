package com.example.observer.blog.one;

/**
 * 具体的目标对象，负责吧有关状态存入到相应的观察者对象
 * 并在自己状态
 */
public class ConcreteSubject extends Subject {
    /**
     * 目标对象的状态
     */
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        this.notifyObservers();
    }
}