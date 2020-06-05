package com.example.observer.blog.two;

/**
 * 观察者接口
 * @author Administrator
 *
 */
public interface Observer {
	
	/**
	 * 
	 * @param data    被观察者传递给观察者的 数据
	 */
	void update(Object data);
	

}
