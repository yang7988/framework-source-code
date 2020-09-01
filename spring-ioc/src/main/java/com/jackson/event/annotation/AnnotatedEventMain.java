package com.jackson.event.annotation;

import com.jackson.event.User;
import com.jackson.event.UserRegisterPublisherService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotatedEventMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-event-annotation.xml");
        UserRegisterPublisherService publisherService = applicationContext.getBean(UserRegisterPublisherService.class);
        publisherService.insert(new User("George", 28));
    }
}
