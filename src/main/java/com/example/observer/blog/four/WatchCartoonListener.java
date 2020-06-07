package com.example.observer.blog.four;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Title: WatchCartoonListener
 * Description:  具体监听者（观察者）
 *
 * @author hfl
 * @version V1.0
 * @date 2020-06-05
 */
public class WatchCartoonListener extends GoodNotifier {

    public WatchCartoonListener() {
        System.out.println("WatchCartoonListener 我正在看漫画，开始时间："+ LocalDateTime.now().toString());
    }

    public void stopPlayingGame(Date date){
        System.out.println("WatchCartoonListener  停止看漫画了，结束时间："+ new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(date));
    }
}
