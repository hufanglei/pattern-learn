package com.example.sington.lazy;

/**
 * Title: LazySimplySington
 * Description: 懒汉单例模式
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-10
 */
public class LazySimplySington {
    private static LazySimplySington lazy;

    private LazySimplySington() {
    }

    //jdk1.8之后对synchronized性能优化不少
    //不可避免还是存在一定的性能问题
    public synchronized static LazySimplySington getInstance() {
        if (lazy == null) {
            lazy = new LazySimplySington();
        }
        return lazy;
    }
}

