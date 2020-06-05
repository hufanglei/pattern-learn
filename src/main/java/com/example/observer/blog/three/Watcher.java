package com.example.observer.blog.three;

public class Watcher  implements WatcherObserver{
    private String job;

    @Override
    public void update(WaterQualitySubject subject) {
        //这里采用的是拉的方式
        System.out.println(job+"获取到通知，当前污染级别为:" + subject.getPolluteLevel());
    }

    @Override
    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String getJob() {
        return this.job;
    }
}
