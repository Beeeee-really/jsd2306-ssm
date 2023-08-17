package cn.tedu.spring.eg4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestShopController {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("cn.tedu.spring.eg4");
        ShopController shopController = context.getBean(ShopController.class);
        System.out.println("4:使用");
        //关闭IoC容器
        context.close();
    }
}
