package com.jackson.reference;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ReferenceMain {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("spring-cycle-reference.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        UserService userService = beanFactory.getBean("userService", UserService.class);
        System.out.println(userService);
    }
}
