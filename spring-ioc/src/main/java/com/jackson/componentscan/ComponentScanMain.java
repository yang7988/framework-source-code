package com.jackson.componentscan;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ComponentScanMain {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("spring-component-scan.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        UserService userService = beanFactory.getBean(UserService.class);

        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-component-scan.xml");
        UserService userService = applicationContext.getBean(UserService.class);*/
        String random = userService.getRandom();
        System.out.println(random);
    }
}
