package com.example.adapter.loginadapter.v2.adapter;

import com.example.adapter.loginadapter.ResultMsg;

/**
 * Title: LoginForQQAdapter
 * Description: qq登录
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-23
 */
public class LoginForQQAdapter implements LoginAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
