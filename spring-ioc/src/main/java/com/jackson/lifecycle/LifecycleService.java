package com.jackson.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;

public class LifecycleService implements BeanPostProcessor, BeanNameAware
        , BeanClassLoaderAware, BeanFactoryAware, InitializingBean, DisposableBean, SmartInstantiationAwareBeanPostProcessor {

    public LifecycleService() {
        System.out.println("自身构造器调用....");
    }

    public void init() {
        System.out.println("自身初始化方法调用....");
    }

    public void close() {
        System.out.println("自身销毁方法调用....");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("BeanClassLoaderAware方法--[setBeanClassLoader]--回调....");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryAware方法---[setBeanFactory]---回调....");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("BeanNameAware方法---[setBeanName]---回调....");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean方法---[destroy]---回调....");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean方法---[afterPropertiesSet]---回调....");
    }

    @Override
    public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println("SmartInstantiationAwareBeanPostProcessor方法---[predictBeanType]---回调....");
        return LifecycleService.class;
    }

    @Override
    public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println("SmartInstantiationAwareBeanPostProcessor方法---[determineCandidateConstructors]---回调....");
        return LifecycleService.class.getConstructors();
    }

    @Override
    public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
        System.out.println("SmartInstantiationAwareBeanPostProcessor方法---[getEarlyBeanReference]---回调....");
        return null;
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println("InstantiationAwareBeanPostProcessor方法---[postProcessBeforeInstantiation]---回调....");
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.println("InstantiationAwareBeanPostProcessor方法---[postProcessAfterInstantiation]---回调....");
        return true;
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        System.out.println("InstantiationAwareBeanPostProcessor方法---[postProcessPropertyValues]---回调....");
        return null;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor方法---[postProcessBeforeInitialization]---回调....");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor方法---[postProcessAfterInitialization]---回调....");
        return bean;
    }
}
