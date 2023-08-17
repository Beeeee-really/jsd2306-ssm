package cn.tedu.spring.config;

import cn.tedu.spring.bean.UserDao;
import cn.tedu.spring.file.DataBase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试自动扫描:ComponentScan
 */
public class TestScan {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        // 1.UserDao
        UserDao userDao = context.getBean(UserDao.class);
        System.out.println(userDao);

        // 2.DataBase
        DataBase dataBase = context.getBean(DataBase.class);
        System.out.println(dataBase);
    }
}






