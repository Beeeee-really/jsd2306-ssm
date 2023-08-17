package cn.tedu.spring.life;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class DBConnect {
    private String userName;

    //1.调用无参构造方法进行实例化操作


    public DBConnect() {
        System.out.println("1.调用无参构造进行实例化");
    }

    //2.属性赋值,调用set()方法

    @Value("root")
    public void setUserName(String userName) {
        this.userName = userName;
        System.out.println("2.进行依赖注入");
    }

    //3.初始化方法
    @PostConstruct
    public void init() {
        System.out.println("3.Bean对象初始化");
    }

    //4.使用阶段



    //5.销毁阶段
    @PreDestroy
    public  void destroy(){
        System.out.println("5:Bean对象销毁之前进行的操作");
    }
}
