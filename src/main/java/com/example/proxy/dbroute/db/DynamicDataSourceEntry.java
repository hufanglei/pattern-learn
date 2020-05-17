package com.example.proxy.dbroute.db;

/**
 * Title: DynamicDataSourceEntry
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-13
 */
public class DynamicDataSourceEntry {
    public final static String DEFAULE_SOURCE = null;
    //线程容器
    private final static ThreadLocal<String> local = new ThreadLocal<String>();

    private DynamicDataSourceEntry() {
    }

    /**
     * 获取当前正在使用的数据源名字
     *
     * @return String
     */
    public static String get() {
        return local.get();
    }

    /**
     * 清空数据源
     */
    public static void clear() {
        local.remove();
    }
    /**
     * 还原当前切面的数据源
     */
    public static void restore() {
        local.set(DEFAULE_SOURCE);
    }

    /**
     * 设置已知名字的数据源
     *
     * @param source
     */
    //DB_2018
    //DB_2019
    public static void set(String source) {
        local.set(source);
    }

    /**
     * 根据年份动态设置数据源
     *
     * @param year
     */
    public static void set(int year) {
        local.set("DB_" + year);
    }

}
