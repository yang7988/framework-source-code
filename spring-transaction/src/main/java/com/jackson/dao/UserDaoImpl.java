package com.jackson.dao;

import com.jackson.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Map;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(User user) {
        String sql = "insert into t_user (name,age,sex,profession,createDate,updateDate) values(?,?,?,?,?,?)";
        Object[] params = new Object[]{user.getName(), user.getAge(), user.getSex(), user.getProfession(), user.getCreateDate(), user.getUpdateDate()};
        return jdbcTemplate.update(sql, params);
    }

    @Override
    public int updateById(User user) {
        String sql = "update t_user set name=?,age=?,sex=?,profession=?,createDate=?,updateDate=? where id = ?";
        Object[] params = new Object[]{user.getName(), user.getAge(), user.getSex(), user.getProfession(), user.getCreateDate(), user.getUpdateDate(), user.getId()};
        return jdbcTemplate.update(sql, params);
    }

    @Override
    public User selectById(Long id) {
        String sql = "select name,age,sex,profession,createDate,updateDate from t_user where id = ?";
        Map<String, Object> map = jdbcTemplate.queryForMap(sql, id);
        User user = new User();
        user.setId((Long) map.get("id"));
        user.setName((String) map.get("name"));
        user.setAge((Integer) map.get("age"));
        user.setSex((Byte) map.get("sex"));
        user.setProfession((String) map.get("profession"));
        user.setCreateDate((Date) map.get("createDate"));
        user.setUpdateDate((Date) map.get("updateDate"));
        return user;
    }

    @Override
    public int deleteById(Long id) {
        String sql = "delete from t_user where id = ?";
        Object[] params = new Object[]{id};
        return jdbcTemplate.update(sql, params);
    }
}
