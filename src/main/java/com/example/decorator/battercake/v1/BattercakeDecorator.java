package com.example.decorator.battercake.v1;

/**
 * Title: BattercakeDecorator
 * Description: 加蛋糕的套餐
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-31
 */
public abstract class BattercakeDecorator extends Battercake {
    private Battercake battercake;

    public BattercakeDecorator(Battercake battercake) {
        this.battercake = battercake;
    }



    @Override
    protected String getMsg() {
        return this.battercake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.battercake.getPrice() + 1;
    }
}
