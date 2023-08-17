package cn.tedu.spring.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestWeiboMapper {
    public static void main(String[] args) {
        //创建IoC容器,并进行Spring Bean对象的创建,并进行DI依赖注入
        //此步之后,在IoC容器中已经存放了很多Spring Bean对象
        ApplicationContext context = new AnnotationConfigApplicationContext("cn.tedu.spring.resource");
        //从IoC容器中,众多的Bean对象中获取到指定的Bean对象
        WeiboMapper weiboMapper = context.getBean(WeiboMapper.class);
        //输出测试
        System.out.println(weiboMapper);
    }
}
