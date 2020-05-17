package com.example.proxy.dynamicproxy.cglibproxy.cglib2;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.cglib.proxy.*;

import java.lang.reflect.Method;

public class SampleClass {
    public String test(String input){
        System.out.println("hello world");
        return "hello world";
    }

    public static void main(String[] args) {
        test3();
    }

    private static void test1() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(SampleClass.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                System.out.println("before method run...");
                Object result = proxy.invokeSuper(obj, args);
                System.out.println("after method run...");
                return result;
            }
        });
        SampleClass sample = (SampleClass) enhancer.create();
        sample.test(null);
    }


    @Test
    public void testFixedValue(){
        test2();
    }

    private static void test2() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(SampleClass.class);
        enhancer.setCallback(new FixedValue() {
            @Override
            public Object loadObject() throws Exception {
                return "Hello cglib";
            }
        });
        SampleClass proxy = (SampleClass) enhancer.create();
//        System.out.println(proxy.test(null)); //拦截test，输出Hello cglib
        System.out.println(proxy.toString());
        System.out.println(proxy.getClass());
//        System.out.println(proxy.hashCode());
    }

//    @Test
//    public void testInvocationHandler() throws Exception{
//        test3();
//    }

    private static void test3() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(SampleClass.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                return null;
            }
        });
        SampleClass proxy = (SampleClass) enhancer.create();
        Assert.assertEquals("hello cglib", proxy.test(null));
        Assert.assertNotEquals("Hello cglib", proxy.toString());
    }
}