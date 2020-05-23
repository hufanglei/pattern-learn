package com.example.adapter.poweradapter;

/**
 * Title: PowerAdapter
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-21
 */
public class PowerAdapter implements DC5 {
    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outputAC220V();
        int adapetOutput = adapterInput / 44;
        System.out.println("使用PowerAdapter 输入AC: " + adapetOutput + "V " + "输出DC：" + adapetOutput + "V");
        return adapetOutput;
    }
}
