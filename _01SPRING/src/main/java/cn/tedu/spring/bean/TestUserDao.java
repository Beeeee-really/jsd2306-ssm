package cn.tedu.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserDao {
    public static void main(String[] args) {
        //1.创建IoC容器,并创建Spring Bean对象[Ctrl + Shift + Alt + c]
        ApplicationContext context = new AnnotationConfigApplicationContext("cn.tedu.spring.bean");
        //2.根据类型获取对应的Spring Bean对象[content.getBean(..).var + 回车]
        //UserDao userDao = context.getBean(UserDao.class);
        UserService userService = context.getBean(UserService.class);
        //3.打印输出测试
        System.out.println("userService = " + userService);
    }
}
