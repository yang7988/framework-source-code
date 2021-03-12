package com.jackson.business.repository;

import com.jackson.business.entity.User;

public interface UserMapper {

    void insert(User user);

    User selectById(Long id);

    int updateById(User user);

    int deleteById(Long id);
}
