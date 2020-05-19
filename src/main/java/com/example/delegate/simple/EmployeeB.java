package com.example.delegate.simple;

/**
 * Title: EmployeeB
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-17
 */
public class EmployeeB implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工B，我现在开始干" + command + "工作");
    }
}
