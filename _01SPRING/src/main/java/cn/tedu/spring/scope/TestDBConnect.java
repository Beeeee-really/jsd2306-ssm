package cn.tedu.spring.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDBConnect {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("cn.tedu.spring.scope");
        System.out.println("1");
        DBConnectScope dBconnect1 = context.getBean(DBConnectScope.class);
        System.out.println(dBconnect1);
        System.out.println("2");
        DBConnectScope dBconnect2 = context.getBean(DBConnectScope.class);
        System.out.println(dBconnect2);
    }
}
