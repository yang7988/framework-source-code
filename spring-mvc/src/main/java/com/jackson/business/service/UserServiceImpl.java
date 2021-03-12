package com.jackson.business.service;

import com.jackson.business.dto.RegisterDTO;
import com.jackson.business.entity.User;
import com.jackson.business.repository.UserMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public User register(RegisterDTO dto) {
        User user = new User();
        BeanUtils.copyProperties(dto, user);
        user.setCreateDate(new Date());
        user.setUpdateDate(new Date());
        userMapper.insert(user);
        return user;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int update(User request) {
        User user = userMapper.selectById(request.getId());
        /*user.setPhone(request.getPhone());
        int i = userMapper.updateById(user);
        try {
            Thread.sleep(52000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return 1;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateEmail(User request) {
        User user = userMapper.selectById(request.getId());
        user.setEmail(request.getEmail());
        int result = userMapper.updateById(user);
        for (int i = 0; i < 2000000; i++) {
            System.out.println(i);
        }
        return result;
    }
}
