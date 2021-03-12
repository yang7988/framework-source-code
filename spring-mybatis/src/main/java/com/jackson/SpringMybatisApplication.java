package com.jackson;

import com.jackson.entity.User;
import com.jackson.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Hello world!
 */
public class SpringMybatisApplication {
    private static UserService userService = new ClassPathXmlApplicationContext("spring-mybatis.xml").getBean(UserService.class);


    public static void main(String[] args) throws Exception {
        User user = select();
        user.setName("杨伟武");
        update(user);
        new Thread(new Runnable() {
            @Override
            public void run() {
                user.setName("赵凯平");
                update(user);
            }
        }).start();
        System.out.println("主线程结束");
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

    public static void update(User user) {
        userService.update(user);
    }

    public static User select() {
        return userService.select(4L);
    }

    public static void delete() {

    }
}
