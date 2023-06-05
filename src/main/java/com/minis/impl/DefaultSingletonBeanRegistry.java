package com.minis.impl;

import com.minis.SingletonBeanRegistry;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    //容器中存放所有Bean的名称的列表
    protected List<String> beanNames = new ArrayList<String>();

    protected Map<String,Object> singletons = new ConcurrentHashMap<String, Object>(256);


    public void registerSingleton(String beanName, Object singletonObject) {
        synchronized (this.singletons){
            this.singletons.put(beanName,singletonObject);
            this.beanNames.add(beanName);
        }
    }

    public Object getSingleton(String beanName) {
        return this.singletons.get(beanName);
    }

    public boolean containsSingleton(String beanName) {
        return this.singletons.containsKey(beanName);
    }

    public String[] getSingletonNames() {
        return (String[]) this.beanNames.toArray();
    }

    protected void removeSingleton(String beanName){
        synchronized (this.singletons){
            this.beanNames.remove(beanName);
            this.singletons.remove(beanName);
        }
    }

}
