package com.example.property;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Title: ExamPaper
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-12
 */
public class ExamPaper {
    String name = "胡防雷";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ExamPaper{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        ExamPaper examPaper = new ExamPaper();
        examPaper.setName("liujuan");
        ExamPaper vo = new ExamPaper();
        //获取所有的方法
        Method[] methods = examPaper.getClass().getMethods();
        for (Method m : methods) {
            //获取get方法
            if (m.getName().startsWith("get")) {
                //执行getName()方法， 获取返回值
                Object value = m.invoke(vo,null);
                //获取属性名
                String targetMethodName = m.getName().replace("get","");
                //获取方法名 并给执行
                vo.getClass().getMethod("set"+targetMethodName).invoke(vo);
            }
        }
        System.out.println(vo.toString());
    }
}
