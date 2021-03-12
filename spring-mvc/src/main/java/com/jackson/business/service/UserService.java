package com.jackson.business.service;

import com.jackson.business.dto.RegisterDTO;
import com.jackson.business.entity.User;

public interface UserService {

    User register(RegisterDTO dto);

    int update(User request);

    int updateEmail(User request);
}
