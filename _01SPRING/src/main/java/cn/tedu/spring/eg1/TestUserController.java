package cn.tedu.spring.eg1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserController {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("cn.tedu.spring.eg1");
        UserController userController = context.getBean(UserController.class);
        System.out.println("UserController:" + userController);
    }
}
