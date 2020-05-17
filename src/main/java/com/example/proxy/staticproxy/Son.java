package com.example.proxy.staticproxy;

import com.example.proxy.Person;

/**
 * Title: Son
 * Description: 真实对象
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-13
 */
public class Son implements Person {
    @Override
    public void findLove() {
        System.out.println("儿子要求：肤白貌美大长腿");
    }
}
