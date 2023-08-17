package cn.tedu.spring.life;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class DBConnect {
    private String username;

    //1.调用无参构造进行实例化操作
    public DBConnect() {
        System.out.println("1:调用无参构造,进行Bean对象实例化");
    }

    //2.依赖注入:属性赋值,调用set()方法
    @Value("root")
    public void setUsername(String username) {
        this.username = username;
        System.out.println("2:属性赋值阶段,调用set()方法");
    }

    //3.初始化方法
    @PostConstruct
    public void init(){
        System.out.println("3:Bean对象初始化方法");
    }

    //4.销毁之前执行的方法
    @PreDestroy
    public void destroy(){
        System.out.println("5:Bean对象销毁之前的操作");
    }
}
