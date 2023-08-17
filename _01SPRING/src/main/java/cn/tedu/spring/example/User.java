package cn.tedu.spring.example;

import org.springframework.stereotype.Component;

/**
 * Component注解: 将此类交由Spring框架来管理,创建出来的对象叫做Spring Bean对象
 */
@Component
public class User {
    public void userRun(){
        System.out.println("七月七日长生殿");
    }
}
