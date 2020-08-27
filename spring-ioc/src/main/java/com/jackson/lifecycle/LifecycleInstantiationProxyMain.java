package com.jackson.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleInstantiationProxyMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-lifecycle-instantiation-proxy.xml");
        BaseService baseService = applicationContext.getBean("baseService", BaseService.class);
        baseService.sayHello();
    }
}
