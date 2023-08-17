package cn.tedu._02mybatis;

import cn.tedu._02mybatis.mapper.UserMapper;
import cn.tedu._02mybatis.mapper.WeiBoMapper;
import cn.tedu._02mybatis.pojo.User;
import cn.tedu._02mybatis.pojo.WeiBo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static javax.swing.text.html.HTML.Tag.U;

@SpringBootTest
class ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private UserMapper userMapper;


    /**
     * 测试方法一定是无参无返回值
     */
    @Test
    void insertTest() {
        User user = new User();
        user.setUsername("awa");
        user.setPassword("111");
        user.setNickname("222");
        user.setCreated(new Date());

        userMapper.insert(user);

    }

    @Autowired
    private WeiBoMapper weiBoMapper;

    @Test
    void insertTest2(){
        WeiBo weiBo = new WeiBo();
        weiBo.setContent("111");
        weiBo.setCreated(new Date());
        weiBo.setUserId(111);

        weiBoMapper.insert(weiBo);

    }

}
