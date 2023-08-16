package cn.tedu.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Value("登录")
    private String name;
    @Autowired
    private UserDao userDao;
    
}
