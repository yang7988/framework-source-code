package com.jackson.event.annotation;

import com.jackson.event.User;
import com.jackson.event.UserRegisterEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class AnnotatedRecommendListener {

    @Order(8)
    @EventListener(classes = UserRegisterEvent.class)
    public void checkUserInfo(UserRegisterEvent event) {
        Object source = event.getSource();
        User user = (User) source;
        System.out.println("hi " + user.getName() + "welcome to here now i will Recommend something for you");
    }
}
