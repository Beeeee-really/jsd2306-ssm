package cn.tedu._04weibo;

import cn.tedu._04weibo.mapper.UserMapper;
import cn.tedu._04weibo.pojo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class UserTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    void selectByUsernameTest(){
        System.out.println(userMapper.selectByUsername("xxx"));
    }

    @Test
    void insertUserTest(){
        User user = new User();
        user.setUsername("雄霸");
        user.setPassword("123456");
        user.setNickname("三分归元气");
        user.setCreated(new Date());
        System.out.println(userMapper.insertUser(user));
    }
}







