package com.jackson.dao;

import com.jackson.entity.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class UserDaoImpl implements UserDao {

    private final List<User> USER_LIST = new ArrayList<User>() {{
        add(new User(1L, "jackson", 29, (byte) 1, "程序员"));
        add(new User(2L, "bob", 35, (byte) 0, "会计师"));
        add(new User(3L, "gergo", 25, (byte) 1, "学生"));
    }};

    @Override
    public User getById(Long id) {
        if (id == null || USER_LIST.isEmpty()) {
            return null;
        } else {
            return USER_LIST.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
        }

    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> getByName(String name) {
        if (StringUtils.isBlank(name) || USER_LIST.isEmpty()) {
            return Collections.EMPTY_LIST;
        } else {
            return USER_LIST.stream().filter(user -> user.getName().equals(name)).collect(Collectors.toList());
        }

    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> getByProfession(String profession) {
        if (StringUtils.isBlank(profession) || USER_LIST.isEmpty()) {
            return Collections.EMPTY_LIST;
        } else {
            return USER_LIST.stream().filter(user -> user.getProfession().equals(profession)).collect(Collectors.toList());
        }
    }

}
