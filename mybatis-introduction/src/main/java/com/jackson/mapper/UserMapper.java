package com.jackson.mapper;

import com.jackson.entity.User;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface UserMapper {

    Integer insert(User user);

    User selectById(Map<String, Object> paramMap);

    List<User> selectByIdCollection(Collection<? extends Long> collection);

    User selectByIdAndTableName(Map<String, Object> paramMap);
}
