package com.jackson;

import com.jackson.business.pojo.User;
import com.jackson.business.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testAop() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aop.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        User user = userService.findById(1L);
        System.out.println(user);
    }

}
