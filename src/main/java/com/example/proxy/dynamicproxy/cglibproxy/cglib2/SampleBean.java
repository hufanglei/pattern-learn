package com.example.proxy.dynamicproxy.cglibproxy.cglib2;

import org.junit.Test;
import org.springframework.cglib.beans.BeanCopier;

import static org.junit.Assert.assertEquals;

public class SampleBean {
    private String value;
 
    public SampleBean() {
    }
 
    public SampleBean(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
 
    public void setValue(String value) {
        this.value = value;
    }

    public static void main(String[] args) throws Exception {
        testBeanCopier();
    }

    public static void testBeanCopier() throws Exception{
        BeanCopier copier = BeanCopier.create(SampleBean.class,
                OtherSampleBean.class, false);//设置为true，则使用converter
        SampleBean myBean = new SampleBean();
        myBean.setValue("Hello cglib");
        OtherSampleBean otherBean = new OtherSampleBean();
        copier.copy(myBean, otherBean, null); //设置为true，则传入converter指明怎么进行转换
        assertEquals("Hello cglib", otherBean.getValue());
    }
}