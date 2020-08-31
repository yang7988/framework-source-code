package com.jackson.event.annotation;

import com.jackson.event.UserRegisterEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class AnnotatedUserInsert1Listener {

    @Order(6)
    @EventListener(classes = UserRegisterEvent.class)
    public void checkUserInfo(UserRegisterEvent event) {
        Object source = event.getSource();
        System.out.println(source);
    }
}
