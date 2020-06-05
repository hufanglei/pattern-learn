package com.example.observer.blog.three;

/**
 * 具体的水质监测对象
 */
public class WaterQuality extends WaterQualitySubject {
    /**
     * 污染的级别，0表示正常，1表示轻度污染，2表示中度污染，3表示高度污染
     */
    private int polluteLevel = 0;

    /**
     * 获取水质污染的级别
     */
    @Override
    public int getPolluteLevel() {
        return polluteLevel;
    }

    public void setPolluteLevel(int polluteLevel) {
        this.polluteLevel = polluteLevel;
        this.notifyWathers();
    }

    /**
     * 通知相应的观察者对象
     */
    @Override
    public void notifyWathers() {
        //循环所在注册的观察者
        for (WatcherObserver watcher: observers){
            //开始根据污染级别判断是否需要通知，由这里总控
            if (this.polluteLevel >=0 ){
                //通知监测员做记录
                if (("监测人员").equals(watcher.getJob())){
                    watcher.update(this);
                }
            }
            if (this.polluteLevel >=1 ){
                //通知预警人员
                if (("预警人员").equals(watcher.getJob())){
                    watcher.update(this);
                }
            }
            if (this.polluteLevel >=2 ){
                //通知监测员部门领导
                if (("监测部门领导").equals(watcher.getJob())){
                    watcher.update(this);
                }
            }

        }
    }

}
