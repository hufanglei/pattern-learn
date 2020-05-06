package com.example.reflect.test;

import java.lang.annotation.Annotation;

/**
 * Title: NetCard
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-02
 */
public class NetCard implements PCI{
    @Override
    public void open() {

        System.out.println("NetCard open");
    }

    @Override
    public void close() {
        System.out.println("NetCard close");
    }
}
