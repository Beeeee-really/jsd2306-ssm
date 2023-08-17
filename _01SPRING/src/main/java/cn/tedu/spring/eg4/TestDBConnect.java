package cn.tedu.spring.eg4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDBConnect {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("cn.tedu.spring.scope");
        System.out.println("1");
        DBconnect dBconnect1 = context.getBean(DBconnect.class);
        System.out.println(dBconnect1);
        System.out.println("2");
        DBconnect dBconnect2 = context.getBean(DBconnect.class);
        System.out.println(dBconnect2);
    }
}
