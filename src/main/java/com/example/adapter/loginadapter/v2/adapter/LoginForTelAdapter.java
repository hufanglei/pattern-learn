package com.example.adapter.loginadapter.v2.adapter;

import com.example.adapter.loginadapter.ResultMsg;

/**
 * Title: LoginForTelAdapter
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-23
 */
public class LoginForTelAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return  adapter instanceof LoginForTelAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
