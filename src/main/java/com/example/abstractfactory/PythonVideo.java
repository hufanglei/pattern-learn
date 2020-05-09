package com.example.abstractfactory;

/**
 * Title: JavaVideo
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-10
 */
public class PythonVideo implements Ivideo {
    @Override
    public void record() {
        System.out.println("提供Python视频回看服务");
    }
}
