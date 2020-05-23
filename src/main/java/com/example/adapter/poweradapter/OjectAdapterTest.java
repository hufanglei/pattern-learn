package com.example.adapter.poweradapter;

/**
 * Title: OjectAdapterTest
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-21
 */
public class OjectAdapterTest {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter(new AC220());
        dc5.outputDC5V();
    }
}
