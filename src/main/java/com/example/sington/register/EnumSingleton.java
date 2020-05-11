package com.example.sington.register;

/**
 * Title: EnumSingleton
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-11
 */
public enum EnumSingleton {
    INSTANCE;

    private String name;

    public String getData() {
        return name;
    }

    public void setData(String data) {
        this.name = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
