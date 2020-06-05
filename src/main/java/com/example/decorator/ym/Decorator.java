package com.example.decorator.ym;

/**
 * 抽象的装饰器
 */
public  abstract class Decorator implements GoodSaleEbi {
    /**
     * 持有被装饰的组件对象
     */
    protected GoodSaleEbi ebi;

    /**
     * 通过构造方法传入被装饰的对象
     * @param ebi 被装饰的对象
     */
    public Decorator(GoodSaleEbi ebi) {
        this.ebi = ebi;
    }


}
