package com.example.proxy.dynamicproxy.cglibproxy;



import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Tom on 2019/3/11.
 */
public class CGlibMeipo implements MethodInterceptor {


    public Object getInstance(Class<?> clazz) throws Exception{
        //相当于Proxy，代理的工具类
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    //var10000.intercept(Son$$EnhancerByCGLIB$$d760ccc, CGLIB$findLove$0$Method, CGLIB$emptyArgs, CGLIB$findLove$0$Proxy);
    @Override
    //methodProxy
    //sig1 findLove()V
    //sig2 CGLIB$findLove$0
    // --createInfo
        //c1;com.example.proxy.staticproxy.Son
        //c2.com.example.proxy.staticproxy.Son$$EnhancerByCGLIB$$d760ccc
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object obj = methodProxy.invokeSuper(o,objects);
        after();
        return obj;
    }

    private void before(){
        System.out.println("我是媒婆，我要给你找对象，现在已经确认你的需求");
        System.out.println("开始物色");
    }

    private void after(){
        System.out.println("OK的话，准备办事");
    }
}
