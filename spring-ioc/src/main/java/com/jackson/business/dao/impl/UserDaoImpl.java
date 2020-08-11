package com.jackson.business.dao.impl;

import com.jackson.business.dao.UserDao;
import com.jackson.business.pojo.User;
import org.apache.commons.lang3.StringUtils;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UserDaoImpl implements UserDao {

    private List<User> userList;

    @Override
    public User getById(Long id) {
        if (id == null || userList == null || userList.isEmpty()) {
            return null;
        } else {
            return userList.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
        }

    }

    @Override
    public List<User> getByName(String name) {
        if (StringUtils.isBlank(name) || userList == null || userList.isEmpty()) {
            return Collections.EMPTY_LIST;
        } else {
            return userList.stream().filter(user -> user.getName().equals(name)).collect(Collectors.toList());
        }

    }

    @Override
    public List<User> getByProfession(String profession) {
        if (StringUtils.isBlank(profession) || userList == null || userList.isEmpty()) {
            return Collections.EMPTY_LIST;
        } else {
            return userList.stream().filter(user -> user.getProfession().equals(profession)).collect(Collectors.toList());
        }
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
