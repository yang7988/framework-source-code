package com.jackson.service;

import com.jackson.entity.User;

public interface UserService {

    int save(User user);

    int update(User user);

    User select(Long id);

    int delete(Long id);
}
