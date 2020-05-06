package com.example.reflect.test;

/**
 * Title: Mainboard
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-02
 */
public class Mainboard {
    public void run() {
        System.out.println("main board run....");
    }
    public void userPCI(PCI p) {
        if (p != null) {
            p.open();
            p.close();
        }
    }
}
