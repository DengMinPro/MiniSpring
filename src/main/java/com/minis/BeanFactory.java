package com.minis;

public interface BeanFactory {

    /**
     * 获取Bean
     * @param beanName
     * @return
     */
    Object getBean(String beanName);

    /**
     *
     * @param name
     * @return
     */
    Boolean containsBean(String name);
    boolean isSingleton(String name);

    boolean isPrototype(String name);

    Class getType(String name);

    void registerBean(String beanName,Object obj);
}
