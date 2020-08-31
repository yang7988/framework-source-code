package com.jackson.event.extend;

import com.jackson.event.User;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class NotifyUserListener implements SmartApplicationListener {

    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
        return eventType == UserRegisterEvent.class;
    }

    @Override
    public boolean supportsSourceType(Class<?> sourceType) {
        return sourceType == User.class;
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        UserRegisterEvent userRegisterEvent = (UserRegisterEvent) event;
        Object source = userRegisterEvent.getSource();
        User user = (User) source;
        System.out.println(((User) source).getName() + "has been registered");
    }

    @Override
    public int getOrder() {
        return 7;
    }
}
