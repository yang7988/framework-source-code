package com.jackson;

import com.jackson.pojo.User;
import com.jackson.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

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
        Resource resource = new ClassPathResource("spring-aop.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        UserService userService = beanFactory.getBean("userService", UserService.class);
        User user = userService.findById(1L);
        System.out.println(user);
    }

}
