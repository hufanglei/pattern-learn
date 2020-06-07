package com.example.observer.blog.four;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Title: WatchingNBAListener
 * Description: 具体监听器（观察者）
 *
 * @author hfl
 * @version V1.0
 * @date 2020-06-05
 */
public class WatchingNBAListener extends GoodNotifier {
    public WatchingNBAListener() {
        System.out.println("WatchingNBAListener我正在看NBA,开始时间是： " + LocalDateTime.now().toString());
    }
    public void stopWatchingTV(Date date){
        System.out.println("WatchingNBAListener 快关闭NBA直播 ， 结束时间是：" +  new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(date));
    }
}
