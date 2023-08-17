package cn.tedu.spring.config;

import cn.tedu.spring.bean.UserDao;
import cn.tedu.spring.example.User;
import cn.tedu.spring.file.Database;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestScan {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        // 1.UserDao
        UserDao userDao = context.getBean(UserDao.class);
        System.out.println(userDao);
        // 2.Database
        Database database = context.getBean(Database.class);
        System.out.println(database);
    }
}
