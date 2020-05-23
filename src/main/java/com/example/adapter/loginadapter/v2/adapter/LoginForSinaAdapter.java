package com.example.adapter.loginadapter.v2.adapter;
import com.example.adapter.loginadapter.ResultMsg;

/**
 * 新浪微博登录
 */
public class LoginForSinaAdapter implements LoginAdapter {

    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForSinaAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}