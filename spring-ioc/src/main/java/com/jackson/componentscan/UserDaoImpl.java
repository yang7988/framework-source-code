package com.jackson.componentscan;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public String getRandom() {
        return RandomStringUtils.randomAscii(16);
    }

}
