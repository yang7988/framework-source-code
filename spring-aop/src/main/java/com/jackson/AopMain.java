package com.jackson;

import com.jackson.entity.User;
import com.jackson.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aop.xml");
        UserService userService = applicationContext.getBean(UserService.class);
        User user = userService.findById(1L);
        System.out.println(user);
    }
}
