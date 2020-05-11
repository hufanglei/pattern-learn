package com.example;

import com.example.sington.lazy.test.ExectorThread;
import com.example.sington.register.EnumSingleton;
import com.example.sington.register.Student;

/**
 * Title: LazySimplySingtonTest
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-10
 */
public class LazySimplySingtonTest {
//    public static void main(String[] args) {
//        Thread t1 = new Thread(new ExectorThread());
//        Thread t2 = new Thread(new ExectorThread());
//        t1.start();
//        t2.start();
//        System.out.println("Exctor End");
//    }

    public static void main(String[] args) {
//        System.out.println( 1==2 & 3==3);
        EnumSingleton.INSTANCE.setData("234");
        String s1 = EnumSingleton.INSTANCE.getData();
        String s2 = EnumSingleton.INSTANCE.getData();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
    }
}
