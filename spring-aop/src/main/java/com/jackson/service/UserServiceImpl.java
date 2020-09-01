package com.jackson.service;

import com.jackson.dao.UserDao;
import com.jackson.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
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
