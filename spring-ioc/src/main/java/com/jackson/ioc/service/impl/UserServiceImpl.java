package com.jackson.ioc.service.impl;

import com.jackson.ioc.dao.UserDao;
import com.jackson.ioc.pojo.User;
import com.jackson.ioc.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Override
    public User findById(Long id) {
        return userDao.getById(id);
    }

    @Override
    public List<User> findByName(String name) {
        return userDao.getByName(name);
    }

    @Override
    public List<User> findByProfession(String profession) {
        return userDao.getByProfession(profession);
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
