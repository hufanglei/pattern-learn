package com.example.delegate.simple;

/**
 * Title: Boss
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-17
 */
public class Boss {
    public void command(String command, Leader leader) {
        leader.doing(command);
    }
}
