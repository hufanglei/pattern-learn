package com.example.decorator.battercake.v1;

/**
 * Title: BaseBattercake
 * Description: 基础套餐--基本的煎饼
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-31
 */
public class BaseBattercake extends Battercake {
    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
