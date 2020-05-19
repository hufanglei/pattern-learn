package com.example.delegate.simple;

/**
 * Title: EmployeeA
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-17
 */
public class EmployeeA implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工A，我现在开始干" + command + "工作");
    }
}
