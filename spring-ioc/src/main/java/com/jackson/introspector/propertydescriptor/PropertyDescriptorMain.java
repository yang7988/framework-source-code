package com.jackson.introspector.propertydescriptor;

import com.jackson.ioc.pojo.User;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PropertyDescriptorMain {
    public static void main(String[] args) {
        User user = new User();
        PropertyDescriptor propertyDescriptor = null;
        try {
            propertyDescriptor = new PropertyDescriptor("profession", User.class);
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
        System.out.println("FeatureDescriptor.getName: " + propertyDescriptor.getName());
        System.out.println("FeatureDescriptor.getDisplayName: " + propertyDescriptor.getDisplayName());
        System.out.println("FeatureDescriptor.getShortDescription: " + propertyDescriptor.getShortDescription());
        System.out.println("FeatureDescriptor.isExpert: " + propertyDescriptor.isExpert());
        System.out.println("FeatureDescriptor.isHidden: " + propertyDescriptor.isHidden());
        System.out.println("FeatureDescriptor.isPreferred: " + propertyDescriptor.isPreferred());
        try {
            assert propertyDescriptor != null;
            Method writeMethod = propertyDescriptor.getWriteMethod();
            writeMethod.invoke(user, "程序员");
            System.out.println(user);
        } catch (InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
        Method writeMethod = propertyDescriptor.getReadMethod();
        Object invoke = null;
        try {
            invoke = writeMethod.invoke(user);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(invoke);
    }
}
