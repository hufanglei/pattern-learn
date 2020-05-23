package com.example.adapter.loginadapter.v2.adapter;

import com.example.adapter.loginadapter.ResultMsg;

/**
 * Title: LoginAdapter
 * Description:
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-23
 */
public interface LoginAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id, Object adapter);
}
