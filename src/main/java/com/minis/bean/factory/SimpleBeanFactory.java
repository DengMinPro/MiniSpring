package com.minis.bean.factory;

import com.minis.BeanDefinition;
import com.minis.BeanDefinitionRegistry;
import com.minis.BeanFactory;
import com.minis.exception.BeansException;
import com.minis.impl.DefaultSingletonBeanRegistry;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;


public class SimpleBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory, BeanDefinitionRegistry {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>(256);

    private List<String> beanDefinitionNames = new ArrayList<String>();


    public void registerBeanDefinition(String name, BeanDefinition bd) {
        this.beanDefinitionMap.put(name,bd);
        this.beanDefinitionNames.add(name);
        if (!bd.isLazyInit()){
            getBean(name);
        }

    }

    public void removeBeanDefinition(String name) {
        this.beanDefinitionMap.remove(name);
        this.beanDefinitionNames.remove(name);
        this.removeSingleton(name);
    }

    public BeanDefinition getBeanDefinition(String name) {
        return this.beanDefinitionMap.get(name);
    }

    public boolean containsBeanDefinition(String name) {
        return this.beanDefinitionNames.contains(name);
    }

    public Object getBean(String beanName){
        return null;
    }

    public Boolean containsBean(String name) {
        return null;
    }

    public boolean isSingleton(String name) {
        return Objects.equals(this.beanDefinitionMap.get(name).SCOPE_SINGLETON,this.beanDefinitionMap.get(name).getScope());
    }

    public boolean isPrototype(String name) {
        return false;
    }

    public Class getType(String name) {
        return null;
    }

    public void registerBean(String beanName, Object obj) {

    }
}
