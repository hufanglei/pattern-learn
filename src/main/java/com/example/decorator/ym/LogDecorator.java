package com.example.decorator.ym;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 实现日志记录
 */
public class LogDecorator extends Decorator {

    public LogDecorator(GoodSaleEbi ebi) {
        super(ebi);
    }

    @Override
    public boolean sale(String user, String cunstomer, SaleModel saleModel) {
        //执行业务
        boolean f = this.ebi.sale(user, cunstomer, saleModel);
        //在执行业务功能后记录日志
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("日志记录:" + user + "于" + simpleDateFormat.format(new Date())
                + "时保存了一条销售记录，客户是：" + cunstomer + ",购买记录是：" + saleModel);
        return f;
    }
}
