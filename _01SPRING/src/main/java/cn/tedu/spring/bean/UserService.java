package cn.tedu.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    //业务名称
    @Value("登录")
    private String sname;
    //UserDao对象
    //@Autowired注解:添加在类上,也可以添加在setter()方法上,进行对象类型属性值注入
    @Autowired
    private UserDao userDao;

    @Override
    public String toString() {
        return "UserService{" +
                "sname='" + sname + '\'' +
                ", userDao=" + userDao +
                '}';
    }
}









