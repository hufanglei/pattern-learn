package com.example.decorator.ym;

/**
 * 商品销售管理的业务接口
 */
public interface GoodSaleEbi {
    /**
     * 保存销售信息
     * @param user 操作人员
     * @param cunstomer 客户
     * @param saleModel 销售数据
     * @return 是否保存成功
     */
    public boolean sale(String user, String cunstomer, SaleModel saleModel);
}
