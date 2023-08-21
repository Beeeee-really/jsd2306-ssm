package cn.tedu._02mybatis.mapper;

import cn.tedu._02mybatis.pojo.*;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 1.Mapper:MyBatis框架注解,让其为此接口创建对应的实现类,并定义数据访问的逻辑
 * 2.接口方法的返回值问题
 *   2.1 增删改语句:统一返回int[受影响的数据条数]
 *   2.2 查询语句:根据实际的查询结果自定义
 */
@Mapper
public interface WeiboMapper {
    /**
     * 1.微博表中插入数据
     *   注意:#{} 在实体类中通过get()方法获取属性的值
     */
    //@Insert("INSERT INTO weibo(content,created,user_id) VALUES (#{content},#{created},#{userId})")
    int insertWeibo(Weibo weibo);

    /**
     * 2.根据微博 id 删除1条数据
     */
    //@Delete("DELETE FROM blog.weibo WHERE id=#{id}")
    int deleteWeiboById(int id);

    /**
     * 3.根据微博 id 修改微博
     *   参数:要传递微博实体类对象
     */
    //@Update("UPDATE blog.weibo SET content=#{content},created=#{created},user_id=#{userId} WHERE id=#{id}")
    int updateWeiboById(Weibo weibo);

    /**
     * 4.根据id查询1条微博数据:id content created user_id
     *   查询:如果字段名和类属性名不一致,则查询时使用别名;
     *   比如此示例中: 数据表字段名为user_id,类属性为userId,则查询时需要使用别名
     */
    //@Select("SELECT id,content,created,user_id userId FROM blog.weibo WHERE id=#{id}")
    Weibo selectWeiboById(int id);

    /**
     * 5.根据用户id查询,该用户发过的所有的微博信息[id content created user_id]
     */
    //@Select("SELECT id,content,created,user_id userId FROM blog.weibo WHERE user_id=#{uid}")
    List<Weibo> selectWeiboByUserId(int uid);

    /**
     * 6.VO类:根据微博id,查询微博的 内容content 和 发布时间created
     */
    //@Select("SELECT content,created FROM blog.weibo WHERE id=#{id}")
    WeiboIndexVO selectWeiboById2(int id);

    /**
     * 7.查询所有微博的 id  content 和 created
     */
    //@Select("SELECT id, content, created FROM weibo")
    List<WeiboVO> selectWeiboAll();

    /**
     * 8.多表查询:微博列表首页展示功能: 用户昵称 微博内容 微博发布时间
     */
    List<WeiboListVO> selectWeiboList();

    /**
     * 9.多表查询:根据微博id查询该条微博的所有评论;
     *   要求显示: 微博内容  用户昵称 评论内容  评论时间
     */
    List<WeiboCommentVO> selectWeiboComment(int wid);

    /**
     * 10.ResultMap单表:根据微博ID查询该条微博的信息
     *    要求显示: 微博id  微博内容content  用户编号user_id
     */
    WeiboMapVO1 selectMap1(int id);

    /**
     * 11.查询指定用户id发的微博信息，要求显示：用户id、用户昵称、List集合中 List<Weibo>
     */
    WeiboMapVO2 selectMap2(int id);
}





