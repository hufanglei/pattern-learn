package com.example.decorator.battercake.v1;

/**
 * Title: SausageDecorator
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-31
 */
public class SausageDecorator extends BattercakeDecorator {
    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }


    @Override
    protected String getMsg() {
        return super.getMsg() + "1根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
