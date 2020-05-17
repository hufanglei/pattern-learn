package com.example.proxy.staticproxy;


import com.example.proxy.Person;

/**
 * Title: Father
 * Description: 代理对象
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-13
 */
public class Father implements Person {
    private Son person;

    public Father(Son person) {
        this.person = person;
    }

    @Override
    public void findLove() {
        System.out.println("父亲物色对象");
        this.person.findLove();
        System.out.println("双方父母同意，确立关系");
    }
}
