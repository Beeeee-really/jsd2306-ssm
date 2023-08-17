package cn.tedu.spring.life;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDBConnect {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("cn.tedu.spring.life");
        DBConnect dBconnect = context.getBean(DBConnect.class);
        //4.使用阶段
        System.out.println("DBConnect:" + dBconnect);
        //关闭IoC容器:Bean对象被销毁
        context.close();//强行销毁



    }
}
