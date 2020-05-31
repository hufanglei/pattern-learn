package com.example.adapter.loginadapter.v1.service;


import com.example.adapter.loginadapter.Member;
import com.example.adapter.loginadapter.ResultMsg;

/**
 * 最简单的 注册登录方式（被适配类Addaptee）
 */
public class SiginService {
    /**
     * 注册方法
     *
     * @param username
     * @param password
     * @return
     */
    public ResultMsg regist(String username, String password) {
        return new ResultMsg(200, "注册成功", new Member());
    }

    /**
     * 登录的方法
     *
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username, String password) {
        return null;
    }
}