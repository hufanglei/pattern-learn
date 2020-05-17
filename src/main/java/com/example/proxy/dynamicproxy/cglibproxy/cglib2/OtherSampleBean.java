package com.example.proxy.dynamicproxy.cglibproxy.cglib2;
import org.junit.Test;
import org.springframework.cglib.beans.BeanCopier;
import static org.junit.Assert.assertEquals;

public class OtherSampleBean {
    private String value;
 
    public String getValue() {
        return value;
    }
 
    public void setValue(String value) {
        this.value = value;
    }



}
 
