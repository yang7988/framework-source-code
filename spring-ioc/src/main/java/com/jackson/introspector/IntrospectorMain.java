package com.jackson.introspector;

import com.jackson.business.pojo.User;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;

public class IntrospectorMain {
    public static void main(String[] args) {
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(User.class);
            beanInfo.getPropertyDescriptors();
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
    }
}
