package cn.tedu.spring.file;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestDatabase {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("cn.tedu.spring.file");
        DataBase dataBase = context.getBean(DataBase.class);
        System.out.println("dataBase = " + dataBase);
    }
}
