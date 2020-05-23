package com.example.adapter.loginadapter.v2.adapter;

import com.example.adapter.loginadapter.ResultMsg;

/**
 * Title: LoginForWechatAdapter
 * Description: 微信登录
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-23
 */
public class LoginForWechatAdapter  implements LoginAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWechatAdapter;
    }
    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
