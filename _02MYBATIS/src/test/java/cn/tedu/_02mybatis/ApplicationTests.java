package cn.tedu._02mybatis;

import cn.tedu._02mybatis.mapper.UserMapper;
import cn.tedu._02mybatis.mapper.WeiboMapper;
import cn.tedu._02mybatis.pojo.User;
import cn.tedu._02mybatis.pojo.Weibo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Date;

@SpringBootTest
class ApplicationTests {

    @Test
    void contextLoads() {
    }

    // 自动装配
    @Autowired
    private UserMapper userMapper;

    /**
     * 测试方法要求:无参无返回值
     */
    @Test
    void insertTest() {
        User user = new User();
        user.setUsername("王克晶");
        user.setPassword("123456");
        user.setNickname("晶晶");
        user.setCreated(new Date());

        userMapper.insert(user);
    }

    //自动装配
    @Autowired
    private WeiboMapper weiboMapper;

    /**
     * 1.微博表中插入1条数据的测试方法
     */
    @Test
    void insertWeiboTest() {
        Weibo weibo = new Weibo();
        weibo.setContent("如果你为门中弟子伤她一分,我便屠你满门");
        weibo.setCreated(new Date());
        weibo.setUserId(100);
        //调用方法
        System.out.println(weiboMapper.insertWeibo(weibo));
    }

    /**
     * 2.根据微博 id 删除1条数据测试
     */
    @Test
    void deleteWeiboByIdTest() {
        System.out.println(weiboMapper.deleteWeiboById(205));
    }


    @Test
    void UpdateWeiBoByIdTest() {
        Weibo weibo = new Weibo();
        weibo.setId(200);
        weibo.setContent("111222333444555666777888999000");
        weibo.setCreated(new Date());
        weibo.setUserId(100);


        System.out.println(weiboMapper.updateWeiBoById(weibo));
    }




    @Test
    void SelectWeiBoByIdTest(){
        System.out.println(weiboMapper.selectWeiBoById(200));
    }

}
