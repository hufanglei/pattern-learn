package com.example.sington.lazy;

/**
 * Title: LazyDoubleCheckSington
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-11
 */
public class LazyDoubleCheckSington {

    private volatile static  LazyDoubleCheckSington lazy = null;

    private LazyDoubleCheckSington() {
    }

    //jdk1.8之后对synchronized性能优化不少
    //不可避免还是存在一定的性能问题
    public static LazyDoubleCheckSington getInstance() {
        if (lazy == null) {
            synchronized (LazyDoubleCheckSington.class) {
                if (lazy == null) {
                    lazy = new LazyDoubleCheckSington();
                    //指令重排序的问题:也就是 第二步和第三步会颠倒,
                    // 解决方式 变量上加voliate，让线程可见

                    //CPU执行时候会转换成JVM指令执行
                    //1.分配内存给这个对象
                    //2.初始化对象
                    //3.将初始化好的对象和内存地址建立关联，赋值
                    //4.用户初次始化
                }
            }
        }
        return lazy;
    }
}
