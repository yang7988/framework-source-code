package com.jackson;

import com.jackson.entity.User;
import com.jackson.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Hello world!
 */
public class App {
    private static UserService userService = new ClassPathXmlApplicationContext("spring-mybatis.xml").getBean(UserService.class);


    public static void main(String[] args) {
        insert();
    }

    public static void insert() {
        User user = new User();
        user.setName("spring");
        user.setAge(10);
        user.setSex((byte) 1);
        user.setProfession("java");
        user.setCreateDate(new Date());
        user.setUpdateDate(new Date());
        int save = userService.save(user);
        System.out.println(String.format("插入%s条数据", save));
    }

    public static void update() {

    }

    public static void select() {

    }

    public static void delete() {

    }
}
