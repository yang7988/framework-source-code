package com.jackson.dao;

import com.jackson.entity.User;

public interface UserDao {

    int insert(User user);

    int updateById(User user);

    User selectById(Long id);

    int deleteById(Long id);
}
