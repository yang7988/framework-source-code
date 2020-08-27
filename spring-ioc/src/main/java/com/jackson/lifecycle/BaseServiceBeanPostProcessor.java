package com.jackson.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BaseServiceBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("before bean initialization execute BeanPostProcessor#postProcessBeforeInitialization");
        return new WrapperService((BaseService) bean);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("after bean initialization execute BeanPostProcessor#postProcessBeforeInitialization");
        return bean;
    }
}
