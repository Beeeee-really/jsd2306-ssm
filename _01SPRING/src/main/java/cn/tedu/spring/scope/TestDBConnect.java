package cn.tedu.spring.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDBConnect {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("cn.tedu.spring.scope");
        // 第1次从IoC容器中获取Bean对象
        DBConnectScope dbConnect1 = context.getBean(DBConnectScope.class);
        System.out.println(dbConnect1);
        // 第2次从IoC容器中获取Bean对象
        DBConnectScope dbConnect2 = context.getBean(DBConnectScope.class);
        System.out.println(dbConnect2);
    }
}
