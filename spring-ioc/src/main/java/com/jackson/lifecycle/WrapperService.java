package com.jackson.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;

public class WrapperService implements BaseService {

    private BaseService baseService;

    public WrapperService(BaseService baseService) {
        this.baseService = baseService;
    }

    @Override
    public void init() {
        System.out.println("WrapperService init");
    }

    @Override
    public void close() {
        baseService.close();
    }

    @Override
    public void sayHello() {
        System.out.println("hello WrapperService");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        baseService.setBeanClassLoader(classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        baseService.setBeanFactory(beanFactory);
    }

    @Override
    public void setBeanName(String name) {
        baseService.setBeanName(name);
    }

    @Override
    public void destroy() throws Exception {
        baseService.destroy();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("WrapperService afterPropertiesSet ");
    }
}
