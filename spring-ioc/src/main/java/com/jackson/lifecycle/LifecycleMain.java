package com.jackson.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
        LifecycleService lifecycleService = applicationContext.getBean("lifecycleService", LifecycleService.class);
        System.out.println(lifecycleService);
    }
}
