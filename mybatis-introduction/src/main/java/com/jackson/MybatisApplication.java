package com.jackson;

import com.jackson.entity.User;
import com.jackson.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Hello world!
 */
public class MybatisApplication {
    public static void main(String[] args) throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectById(new HashMap<String, Object>() {{
            put("id", 1L);
        }});
        List<User> users = userMapper.selectByIdCollection(Arrays.asList(1L, 2L));
        users.forEach(System.out::println);
        System.out.println(user);
    }
}
