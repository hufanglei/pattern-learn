package com.example.decorator.ym;

/**
 * 基本的业务实现对象
 */
public class GoodSaleEbo implements GoodSaleEbi {
    @Override
    public boolean sale(String user, String cunstomer, SaleModel saleModel) {
        System.out.println(user + "保存了，" + cunstomer + "购买" + saleModel + "的销售数据");
        return true;
    }
}
