package com.example.proxy.dynamicproxy.cglibproxy.cglib2;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.cglib.beans.BeanGenerator;
import org.springframework.cglib.beans.ImmutableBean;

import java.lang.reflect.Method;

/**
 * Title: TestImutableBean
 * Description: ，不可变的Bean
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-16
 */
public class TestImutableBean {
    @Test(expected = IllegalStateException.class)
    public void testImmutableBean() throws Exception{
        SampleBean bean = new SampleBean();
        bean.setValue("Hello world");
        SampleBean immutableBean = (SampleBean) ImmutableBean.create(bean); //创建不可变类
        Assert.assertEquals("Hello world",immutableBean.getValue());
        System.out.println("111  "+ immutableBean.getValue());
        bean.setValue("Hello world, again"); //可以通过底层对象来进行修改
        System.out.println(immutableBean.getValue());
        Assert.assertEquals("Hello world, again", immutableBean.getValue());
        System.out.println(immutableBean.getValue());
        System.out.println(444);
        immutableBean.setValue("Hello cglib"); //直接修改将throw exception
        System.out.println(111);
        System.out.println(immutableBean.getValue());
    }

    @Test
    public void testBeanGenerator() throws Exception{
        BeanGenerator beanGenerator = new BeanGenerator();
        beanGenerator.addProperty("value",String.class);
        Object myBean = beanGenerator.create();
        Method setter = myBean.getClass().getMethod("setValue",String.class);
        setter.invoke(myBean,"Hello cglib");

        Method getter = myBean.getClass().getMethod("getValue");
        Assert.assertEquals("Hello cglib",getter.invoke(myBean));
    }
}
