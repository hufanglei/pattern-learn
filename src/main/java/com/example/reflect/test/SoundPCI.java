package com.example.reflect.test;

/**
 * Title: SoundPCI
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-02
 *
 */
public class SoundPCI implements PCI {
    @Override
    public void open() {
        System.out.println("SoundP open");
    }
    @Override
    public void close() {
        System.out.println("SoundP close");
    }
}
