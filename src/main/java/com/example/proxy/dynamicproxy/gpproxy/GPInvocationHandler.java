package com.example.proxy.dynamicproxy.gpproxy;

import java.lang.reflect.Method;

/**
 * Title: GPInvocationHandler
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-14
 */
public interface GPInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
