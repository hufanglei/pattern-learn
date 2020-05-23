package com.example.adapter.loginadapter.v2;

import com.example.adapter.loginadapter.ResultMsg;
import com.example.adapter.loginadapter.v1.service.SiginService;
import com.example.adapter.loginadapter.v2.adapter.*;

/**
 * Title: PassportForThirdAdapter
 * Description: 第三方登录自由适配
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-23
 */
public class PassportForThirdAdapter extends SiginService implements IPassportForThird {

    @Override
    public ResultMsg loginForQQ(String id) {
        return processLogin(id, LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForWechat(String id) {
        return processLogin(id, LoginForWechatAdapter.class);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return processLogin(token, LoginForTokenAdapter.class);
    }

    @Override
    public ResultMsg loginForTelphone(String telphone, String code) {
        return processLogin(telphone, LoginForTelAdapter.class);
    }

    @Override
    public ResultMsg loginForRegist(String username, String passport) {
        super.regist(username, null);
        return super.login(username, null);
    }

    //这里用到了简单工厂模式及策略模式
    private ResultMsg processLogin(String key, Class<? extends LoginAdapter> clazz) {
        try {
            LoginAdapter adapter = clazz.newInstance();
            if (adapter.support(adapter)) {
                System.out.println("传入参数是: key"+"; 调用 "+adapter+" 的login方法");
                return adapter.login(key, adapter);
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
