package com.example.decorator.battercake.v2;

/**
 * Title: EggDecorator
 * Description: 鸡蛋装饰者
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-31
 */
public class EggDecorator extends BattercakeDecorator {

    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected void doSomething() {
    }

    @Override
    protected String getMsg() {
        return super.getMsg()+"+1个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() +1;
    }
}
