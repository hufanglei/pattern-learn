package com.example.adapter.loginadapter.v2.adapter;

import com.example.adapter.loginadapter.ResultMsg;

/**
 * Title: LoginForTokenAdapter
 * Description: token自动登录
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-23
 */
public class LoginForTokenAdapter implements LoginAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }
    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
