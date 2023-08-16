package cn.tedu.spring.eg3;

import cn.tedu.spring.auto.UserCache;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class CommentMapper {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("cn.tedu.spring.auto");
        UserCache userCache = context.getBean(UserCache.class);
        System.out.println("userDao:" + userCache);
    }
}
