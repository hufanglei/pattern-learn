package com.example.adapter.loginadapter.v2;

/**
 * Title: PassportTest
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-23
 */
public class PassportTest {
    public static void main(String[] args) {
        IPassportForThird passportForThird = new PassportForThirdAdapter();
        //原来的接口 可用
        passportForThird.loginForRegist("admin","admin");
        //新增适配的接口 同样可用
        passportForThird.loginForQQ("11");
    }
}
