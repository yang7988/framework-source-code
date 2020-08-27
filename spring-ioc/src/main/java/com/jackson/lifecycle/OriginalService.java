package com.jackson.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;

public class OriginalService implements BaseService {

    @Override
    public void init() {
        System.out.println("OriginalService init");
    }

    @Override
    public void close() {
        System.out.println("OriginalService close");
    }

    @Override
    public void sayHello() {
        System.out.println("hello OriginalService");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("OriginalService setBeanClassLoader " + classLoader.getClass().getName());
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("OriginalService setBeanFactory " + beanFactory.getClass().getName());
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("OriginalService setBeanName " + name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("OriginalService destroy ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("OriginalService afterPropertiesSet ");
    }
}
