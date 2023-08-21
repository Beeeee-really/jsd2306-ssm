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

import javax.annotation.Resource;
import java.util.ArrayList;
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
    void insertTest(){
        User user = new User();
        user.setUsername("齐雷666");
        user.setPassword("123456");
        user.setNickname("雷神");
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
    void insertWeiboTest(){
        Weibo weibo = new Weibo();
        weibo.setContent("如果你为天下人损她一毫,我便杀尽天下人");
        weibo.setCreated(new Date());
        weibo.setUserId(100);
        //调用方法
        System.out.println(weiboMapper.insertWeibo(weibo));
    }

    /**
     * 2.根据微博 id 删除1条数据测试
     */
    @Test
    void deleteWeiboByIdTest(){
        System.out.println(weiboMapper.deleteWeiboById(205));
    }

    /**
     * 3.根据微博 id 修改微博测试
     */
    @Test
    void updateWeiboByIdTest(){
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
    void selectWeiboByIdTest(){
        System.out.println(weiboMapper.selectWeiboById(200));
    }

    /**
     * 5.根据用户id查询,该用户发过的所有的微博信息[id content created user_id]测试
     */
    @Test
    void selectWeiboByUserIdTest(){
        System.out.println(weiboMapper.selectWeiboByUserId(100));
    }

    /**
     * 6.VO类:根据微博id,查询微博的 内容content 和 发布时间created 测试
     */
    @Test
    void selectWeiboById2Test(){
        System.out.println(weiboMapper.selectWeiboById2(200));
    }

    /**
     * 7.查询所有微博的 id  content 和 created 测试
     */
    @Test
    void selectWeiboAllTest(){
        System.out.println(weiboMapper.selectWeiboAll());
    }

    @Autowired
    private CommentMapper commentMapper;

    /**
     * 1. 根据评论ID删除1条评论 [测试时删除id为304的评论]
     */
    @Test
    void deleteCommentByIdTest(){
        System.out.println(commentMapper.deleteCommentById(304));
    }

    /**
     * 2. 根据评论ID修改1条评论
     */
    @Test
    void UpdateCommentByIdTest(){
        Comment comment = new Comment();
        comment.setId(300);
        comment.setContent("果然高手都在评论区");
        comment.setCreated(new Date());
        comment.setUserId(100);
        comment.setWeiboId(200);
        System.out.println(commentMapper.UpdateCommentById(comment));
    }

    /**
     * 3. 根据评论ID查询1条评论, 只显示 评论的内容 评论的时间 用户的id
     */
    @Test
    void selectCommentById(){
        System.out.println(commentMapper.selectCommentById(300));
    }

    /**
     * 4. 根据用户ID查询该用户都发表过哪些评论,
     *    需要 评论的内容  评论的时间  微博的id
     */
    @Test
    void selectCommentsByIdTest(){
        System.out.println(commentMapper.selectCommentsById(100));
    }

    /**
     * 5.统计总共有多少条评论
     */
    @Test
    void selectCountAll(){
        System.out.println(commentMapper.selectCountAll());
    }

    /**
     * 6.数组方式:根据评论id,动态删除评论表中数据测试
     */
    @Test
    void deleteByIds1Test(){
        Integer[] ids = {303, 600, 800};
        System.out.println(commentMapper.deleteByIds1(ids));
    }

    /**
     * 7.集合方式:根据评论id,动态删除评论表中数据测试
     */
    @Test
    void deleteByIds2Test(){
        ArrayList<Integer> ids = new ArrayList<>();
        ids.add(302);
        ids.add(900);
        ids.add(1000);
        System.out.println(commentMapper.deleteByIds2(ids));
    }

    /**
     * 8.动态修改:根据评论ID修改评论的相关内容测试
     */
    @Test
    void dynamicUpdateTest(){
        Comment comment = new Comment();
        comment.setId(300);
        comment.setUserId(101);
        comment.setContent("与尔同消万古愁");
        System.out.println(commentMapper.dynamicUpdate(comment));
    }

    /**
     * 多表查询:微博列表首页展示功能: 用户昵称 微博内容 微博发布时间
     */
    @Test
    void selectWeiboListTest(){
        System.out.println(weiboMapper.selectWeiboList());
    }

    /**
     * 9.多表查询:根据微博id查询该条微博的所有评论;
     *   要求显示: 微博内容  用户昵称 评论内容  评论时间
     */
    @Test
    void selectWeiboCommentTest(){
        System.out.println(weiboMapper.selectWeiboComment(200));
    }

    /**
     * 10. ResultMap单表:根据微博ID查询该条微博的信息
     */
    @Test
    void selectMap1Test(){
        System.out.println(weiboMapper.selectMap1(200));
    }

    /**
     * 11.查询指定用户id发的微博信息，要求显示：用户id、用户昵称、List集合中 List<Weibo>
     */
    @Test
    void selectMap2Test(){
        System.out.println(weiboMapper.selectMap2(100));
    }

    /**
     * 12. 查询指定微博id的所有评论信息，要求显示：微博id、微博内容、评论的集合List<Comment>
     */
    @Test
    void selectMap3Test(){
        System.out.println(weiboMapper.selectMap3(200));
    }
}










