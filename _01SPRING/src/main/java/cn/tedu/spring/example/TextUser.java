package cn.tedu.spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试类，由Spring创建java类对象测试
 */
public class TextUser {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //1
        User user = new User();
        user.userRun();
        //2
        Class zz = Class.forName("cn.tedu.spring.example.User");
        User user1 = (User) zz.newInstance();
        user1.userRun();
        //3
        ApplicationContext context = new AnnotationConfigApplicationContext("cn.tedu.spring.example");
        User user2 = context.getBean(User.class);
        user2.userRun();


    }
}
