package cn.tedu.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserDao {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("cn.tedu.spring.bean");
        UserService userService = context.getBean(UserService.class);
        System.out.println("userDao:" + userService);
    }
}

