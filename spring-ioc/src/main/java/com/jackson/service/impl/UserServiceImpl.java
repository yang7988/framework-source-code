package com.jackson.service.impl;

import com.jackson.dao.UserDao;
import com.jackson.pojo.User;
import com.jackson.service.UserService;

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
