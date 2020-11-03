package com.jackson.mapper;

import com.jackson.entity.User;

public interface UserMapper {

    int insert(User user);

    int updateById(User user);

    User selectById(Long id);

    int deleteById(Long id);
}
