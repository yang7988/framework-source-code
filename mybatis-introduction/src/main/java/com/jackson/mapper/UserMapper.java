package com.jackson.mapper;

import com.jackson.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User selectById(@Param("id") Long id);
}
