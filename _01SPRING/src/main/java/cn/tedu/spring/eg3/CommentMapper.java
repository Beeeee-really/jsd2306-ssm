package cn.tedu.spring.eg3;

import cn.tedu.spring.auto.UserCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

@Controller(value = "commentMapper")
public class CommentMapper {
   @Autowired
   @Qualifier(value = "mapperImpl1")
    private Mapper mapper;
}
