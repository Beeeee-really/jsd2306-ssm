package cn.tedu.spring.life;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDBConnect {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("cn.tedu.spring.life");
        DBConnect dbConnect = context.getBean(DBConnect.class);
        //4.使用阶段
        System.out.println("4:使用Spring Bean阶段");
        //关闭IoC容器:Spring Bean对象销毁
        context.close();
    }
}
