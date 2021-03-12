package com.jackson.mapper;

import com.jackson.entity.User;

import java.util.List;

public interface UserMapper {

    int insert(User user);

    int updateById(User user);

    User selectById(Long id);

    int deleteById(Long id);

    List<User> selectByAge(Integer age);
}
