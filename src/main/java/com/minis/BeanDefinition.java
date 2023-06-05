package com.minis;

import com.minis.property.ArgumentValues;
import com.minis.property.PropertyValues;

public class BeanDefinition {


    /**
     * 单例模式
     */
    String SCOPE_SINGLETON = "singleton";
    /**
     * 原型模式
     */
    String SCOPE_PROTOTYPE = "prototype";
    /**
     * 懒加载
     */
    private boolean lazyInit = false;
    /**
     * 依赖项目
     */
    private String[] dependsOn;
    /**
     * 构造函数名称
     */
    private ArgumentValues constructorArgumentValues;
    /**
     * 属性定义
     */
    private PropertyValues propertyValues;
    /**
     * 初始化方法名称
     */
    private String initMethodName;
    /**
     * Bean类型
     */
    private volatile Object beanClass;
    /**
     * BeanId
     */
    private String id;
    /**
     * 类名称
     */
    private String className;
    /**
     * 处理范围
     */
    private String scope = SCOPE_SINGLETON;

    public BeanDefinition(String id, String className) {
        this.id = id;
        this.className = className;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public boolean isLazyInit() {
        return lazyInit;
    }

    public void setLazyInit(boolean lazyInit) {
        this.lazyInit = lazyInit;
    }

    public String[] getDependsOn() {
        return dependsOn;
    }

    public void setDependsOn(String[] dependsOn) {
        this.dependsOn = dependsOn;
    }

    public ArgumentValues getConstructorArgumentValues() {
        return constructorArgumentValues;
    }

    public void setConstructorArgumentValues(ArgumentValues constructorArgumentValues) {
        this.constructorArgumentValues = constructorArgumentValues;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }

    public String getInitMethodName() {
        return initMethodName;
    }

    public void setInitMethodName(String initMethodName) {
        this.initMethodName = initMethodName;
    }

    public Object getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Object beanClass) {
        this.beanClass = beanClass;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
