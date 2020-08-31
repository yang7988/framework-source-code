package com.jackson.componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentScanMain {
    public static void main(String[] args) {
        /*Resource resource = new ClassPathResource("spring-component-scan.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        UserService userService = beanFactory.getBean(UserService.class);*/

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-component-scan.xml");
        UserService userService = applicationContext.getBean(UserService.class);
        String random = userService.getRandom();
        System.out.println(random);
    }
}
