package cn.tedu.spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试类:由Spring框架创建Java Bean对象的测试
 */
public class TestUser {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        /*
        1.可以通过new方式创建
         */
        User user = new User();
        user.userRun();
        /*
        2.通过反射方式创建
         */
        Class zz = Class.forName("cn.tedu.spring.example.User");
        User user1 = (User) zz.newInstance();
        user1.userRun();
        /*
        3.通过Spring框架来创建
         */
        /* 复制包路径的快捷键:
        *  Windows: 没有Fn按键: Ctrl + Shift + Alt + c
        *           有Fn按键:Fn + Ctrl + Shift + Alt + c
        *  Mac: Command + Shift + c
        * */
        ApplicationContext context = new AnnotationConfigApplicationContext("cn.tedu.spring.example");
        // context.getBean(User.class).var + 回车
        User user2 = context.getBean(User.class);
        user2.userRun();
    }
}








