package com.jackson.business.service;

import com.jackson.business.pojo.User;

import java.util.List;

public interface UserService {

    /**
     * 通过ID 查找用户
     *
     * @param id 用户id
     * @return user
     */
    User findById(Long id);

    /**
     * 通过用户名称 查找用户
     *
     * @param name 用户姓名
     * @return user列表
     */
    List<User> findByName(String name);

    /**
     * 通过用户职业 查找用户
     *
     * @param profession 用户职业
     * @return user列表
     */
    List<User> findByProfession(String profession);
}
