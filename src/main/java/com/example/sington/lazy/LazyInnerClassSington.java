package com.example.sington.lazy;

/**
 * Title: LazyInnerClassSington
 * Description: 内部类单例
 * 全程没有用到 synctronize关键字
 * 性能最优的一种写法
 * @author hfl
 * @version V1.0
 * @date 2020-05-11
 */
public class LazyInnerClassSington {

    //虽然构造方法有了，但是逃不过反射的法眼
    private LazyInnerClassSington() {
        if (LazyHolder.lazy != null){
            throw new RuntimeException("不允许构建多个实例");
        }
    }
    //懒汉式单例
    //LazyHolder里面的逻辑需要等到外部方法调用时才执行
    //巧妙利用了内部类的特性
    //JVM底层执行逻辑，完美的避免了线程安全问题
    public static final LazyInnerClassSington getInstance(){
        return LazyHolder.lazy;
    }
    private static class LazyHolder{
        private static final LazyInnerClassSington lazy = new LazyInnerClassSington();
    }
}
