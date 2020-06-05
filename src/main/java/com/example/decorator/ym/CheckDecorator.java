package com.example.decorator.ym;

/**
 * 实现权限控制的装饰器
 */
public class CheckDecorator  extends Decorator{
    /**
     * 通过构造方法传入被装饰的对象
     *
     * @param ebi 被装饰的对象
     */
    public CheckDecorator(GoodSaleEbi ebi) {
        super(ebi);
    }
    //权限控制逻辑


    @Override
    public boolean sale(String user, String cunstomer, SaleModel saleModel) {
        if (!"张三".equals(user)){
            System.out.println("对不起" + user + ",你没有保存销售单的权限");
            return false;
        }else{
            return this.ebi.sale(user,cunstomer,saleModel);
        }
    }
}
