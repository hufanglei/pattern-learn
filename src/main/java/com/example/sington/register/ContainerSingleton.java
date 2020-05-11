package com.example.sington.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Title: ContainerSingleton
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-11
 */
public class ContainerSingleton {

    private ContainerSingleton() {
    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getBean(String className) {
        synchronized (ioc){
            if (!ioc.containsKey(className)) {
                Object obj = null;
                try {
                    obj = Class.forName(className).getInterfaces();
                    ioc.put(className, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return ioc.get(className);
        }
    }
}
