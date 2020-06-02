package com.example.decorator.battercake.v2;

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


    //、用于扩展一个类的功能或给一个类添加附加职责。
    protected abstract void doSomething();

    @Override
    protected String getMsg() {
        return this.battercake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.battercake.getPrice() + 1;
    }
}
