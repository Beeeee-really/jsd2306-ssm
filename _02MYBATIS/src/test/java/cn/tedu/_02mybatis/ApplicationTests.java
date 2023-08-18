package cn.tedu._02mybatis;

import cn.tedu._02mybatis.mapper.CommentMapper;
import cn.tedu._02mybatis.mapper.UserMapper;
import cn.tedu._02mybatis.mapper.WeiboMapper;
import cn.tedu._02mybatis.pojo.Comment;
import cn.tedu._02mybatis.pojo.User;
import cn.tedu._02mybatis.pojo.Weibo;
import cn.tedu._02mybatis.pojo.WeiboIndexVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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

    /**
     * 3.根据微博 id 修改微博测试
     */
    @Test
    void updateWeiboByIdTest() {
        Weibo weibo = new Weibo();
        weibo.setId(200);
        weibo.setContent("风云际会潜水游");
        weibo.setCreated(new Date());
        weibo.setUserId(100);
        System.out.println(weiboMapper.updateWeiboById(weibo));
    }

    /**
     * 4.根据id查询1条微博数据:id content created user_id
     */
    @Test
    void selectWeiboByIdTest() {
        System.out.println(weiboMapper.selectWeiboById(200));
    }

    /**
     * 5.根据用户id查询,该用户发过的所有的微博信息[id content created user_id]测试
     */
    @Test
    void selectWeiboByUserIdTest() {
        System.out.println(weiboMapper.selectWeiboByUserId(100));
    }

    /**
     * 6.VO类:根据微博id,查询微博的 内容content 和 发布时间created 测试
     */
    @Test
    void selectWeiboById2Test() {
        System.out.println(weiboMapper.selectWeiboById2(200));
    }


    @Test
    void selectWeiBoAllTest() {
        System.out.println(weiboMapper.selectWeiBoAll());
    }

    @Autowired
    private CommentMapper commentMapper;

    @Test
    void deleteCommentById() {
        System.out.println(commentMapper.deleteCommentById(304));
    }


    @Test
    void updateCommentByIdTest() {
        Comment comment = new Comment();
        comment.setContent("1111");
        comment.setCreated(new Date());
        comment.setUserId(12121);
        comment.setWeiboId(3333);
        comment.setId(303);
        System.out.println(commentMapper.updateCommentById(comment));
    }


    @Test
    void selectCommentByIdTest() {
        System.out.println(commentMapper.selectCommentById(303));
    }


    @Test
    void selectCommentAllByUserIdTest() {
        System.out.println(commentMapper.selectCommentAllByUserId(100));
    }

}
