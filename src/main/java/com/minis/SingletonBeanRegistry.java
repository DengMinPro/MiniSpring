package com.minis;

/**
 * 单例Bean存储
 */
public interface SingletonBeanRegistry {

    /**
     * 注册
     * @param beanName
     * @param singletonObject
     */
    void registerSingleton(String beanName,Object singletonObject);

    /**
     * 获取
     * @param beanName
     * @return
     */
    Object getSingleton(String beanName);

    /**
     * 判断是否存在
     * @param beanName
     * @return
     */
    boolean containsSingleton(String beanName);

    /**
     * 获取Bean名称
     * @return
     */
    String[] getSingletonNames();
}
