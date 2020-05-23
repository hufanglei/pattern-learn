package com.example.adapter.loginadapter.v2;

import com.example.adapter.loginadapter.ResultMsg;

/**
 * Title: IPassportForThird
 * Description: 第三方登录兼容接口
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-23
 */
public interface IPassportForThird {
    /**
     * QQ 登录
     * @param id
     * @return
     */
    ResultMsg loginForQQ(String id);
    /**
     * 微信登录
     * @param id
     * @return
     */
    ResultMsg loginForWechat(String id);
    /**
     * 记住登录状态后自动登录
     * @param token
     * @return
     */
    ResultMsg loginForToken(String token);
    /**
     * 手机号登录
     * @param telphone
     * @param code
     * @return
     */
    ResultMsg loginForTelphone(String telphone, String code);
    /**
     * 注册后自动登录
     * @param username
     * @param passport
     * @return
     */
    ResultMsg loginForRegist(String username, String passport);
}
