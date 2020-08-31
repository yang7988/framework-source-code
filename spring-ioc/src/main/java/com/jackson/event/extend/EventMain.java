package com.jackson.event.extend;

import com.jackson.event.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-event-extends.xml");
        UserRegisterPublisherService publisherService = applicationContext.getBean(UserRegisterPublisherService.class);
        publisherService.insert(new User("George", 28));

    }
}
