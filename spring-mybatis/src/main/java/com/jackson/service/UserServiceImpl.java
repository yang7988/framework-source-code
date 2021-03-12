package com.jackson.service;

import com.jackson.entity.User;
import com.jackson.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
    @Transactional(rollbackFor = Exception.class)
    public int update(User user) {
        int i = userMapper.updateById(user);
        try {
            Thread.sleep(80000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public User select(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public int delete(Long id) {
        return userMapper.deleteById(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<User> selectByAge(Integer age) {
        return userMapper.selectByAge(age);
    }
}
