package com.jackson.ioc.service;

import com.jackson.ioc.pojo.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DependcncyMain {

    public static void main(String[] args) {
        Resource resource = new ClassPathResource("spring-dependency-injection.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-dependency-injection.xml");
        UserService userService = beanFactory.getBean("userService", UserService.class);
//        UserService userService = applicationContext.getBean("userService", UserService.class);
        User user = userService.findById(1L);
        System.out.println(user);
    }
}
