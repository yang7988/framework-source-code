package com.jackson.service;

import com.jackson.entity.User;
import com.jackson.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int save(User user) {
        int insert = userMapper.insert(user);
//        int i = 1 / 0;
        return insert;
    }

    @Override
    public int update(User user) {
        return userMapper.updateById(user);
    }

    @Override
    public User select(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public int delete(Long id) {
        return userMapper.deleteById(id);
    }
}
