package com.example.decorator.ym;

public class client {
    public static void main(String[] args) {
        //得到业务接口，组合装饰器
        GoodSaleEbi ebi = new CheckDecorator(new LogDecorator(new GoodSaleEbo()));
        //准备测试数据
        SaleModel saleModel = new SaleModel();
        saleModel.setGoods("moto 手机");
        saleModel.setSaleNum(2);
        //调用业务功能
        ebi.sale("张三","张三丰",saleModel);
        ebi.sale("李四","张三丰",saleModel);
    }
}
