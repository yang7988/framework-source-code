package com.jackson;

import com.jackson.ioc.pojo.User;
import com.jackson.ioc.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import static org.junit.Assert.assertTrue;


/**
 * Unit test for simple App.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testPojoInject() throws Exception {
        Resource resource = new ClassPathResource("spring-ioc-pojo.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        User student = beanFactory.getBean("student", User.class);
        System.out.println(student);

        User teacher = beanFactory.getBean("teacher", User.class);
        System.out.println(teacher);
    }

    @Test
    public void testDependency() throws Exception {
        Resource resource = new ClassPathResource("spring-dependency-injection.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-dependency-injection.xml");
        UserService userService = beanFactory.getBean("userService", UserService.class);
//        UserService userService = applicationContext.getBean("userService", UserService.class);
        User user = userService.findById(1L);
        System.out.println(user);
    }
}
