package com.example.observer.blog.three;

public interface WatcherObserver {
    /**
     * 被通知的方法
     * @param subject
     */
    public void update(WaterQualitySubject subject);
    /**
     * 设置观察人员的职务
     */
    public void setJob(String job);
    /**
     * 获取观察人员的职务
     */
    public String getJob();


}
