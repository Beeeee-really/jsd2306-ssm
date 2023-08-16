package cn.tedu.spring.auto;

import cn.tedu.spring.bean.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserCache {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("cn.tedu.spring.auto");
        UserCache userCache = context.getBean(UserCache.class);
        System.out.println("userDao:" + userCache);
    }
}
