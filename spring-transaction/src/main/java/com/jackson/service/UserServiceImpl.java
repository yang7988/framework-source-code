package com.jackson.service;

import com.jackson.dao.UserDao;
import com.jackson.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int save(User user) {
        int insert = userDao.insert(user);
        return insert;
    }

    @Override
    public int update(User user) {
        return userDao.updateById(user);
    }

    @Override
    public User select(Long id) {
        return userDao.selectById(id);
    }

    @Override
    public int delete(Long id) {
        return userDao.deleteById(id);
    }
}
