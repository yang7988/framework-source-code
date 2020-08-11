package com.jackson.introspector.methoddescriptor;

import com.jackson.business.pojo.User;

import java.beans.MethodDescriptor;
import java.beans.ParameterDescriptor;
import java.lang.reflect.Method;
import java.util.Date;

public class MethodDescriptorMain {
    public static void main(String[] args) {
        Method method = null;
        try {
            method = User.class.getMethod("setCreateDate", Date.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        assert method != null;
        MethodDescriptor methodDescriptor = new MethodDescriptor(method);
        System.out.println(methodDescriptor.getName());
        System.out.println(methodDescriptor.getMethod());
        for (ParameterDescriptor parameterDescriptor : methodDescriptor.getParameterDescriptors()) {
            System.out.println(parameterDescriptor.getName());

        }
    }

}
