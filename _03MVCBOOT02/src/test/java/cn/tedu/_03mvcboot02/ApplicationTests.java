package cn.tedu._03mvcboot02;

import cn.tedu._03mvcboot02.mapper.UserMapper;
import cn.tedu._03mvcboot02.pojo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private UserMapper userMapper;

    @Test
    void insertUserTest(){
        User user = new User();
        user.setUsername("迪丽热巴");
        user.setPassword("123456");
        user.setNickname("胖迪");
        user.setCreated(new Date());
        userMapper.insertUser(user);
    }

}
