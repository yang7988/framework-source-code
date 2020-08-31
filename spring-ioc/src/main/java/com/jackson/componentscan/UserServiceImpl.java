package com.jackson.componentscan;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource(name = "userDaoImpl")
    private UserDao userDao;

    @Override
    public String getRandom() {
        return userDao.getRandom();
    }

    @Override
    @PostConstruct
    public void init() {
        System.out.println("UserServiceImpl init");
    }

    @Override
    @PreDestroy
    public void destroy() {
        System.out.println("UserServiceImpl destroy");
    }
}
