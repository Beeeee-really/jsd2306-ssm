package cn.tedu._02mybatis.mapper;

import cn.tedu._02mybatis.pojo.Weibo;
import org.apache.ibatis.annotations.*;

/**
 * 1.Mapper:MyBatis框架注解,让其为此接口创建对应的实现类,并定义数据访问的逻辑
 * 2.接口方法的返回值问题:
 * 增删改语句:统一返回int
 */
@Mapper
public interface WeiboMapper {


    /**
     * 1.微博表中插入数据
     * 注意:#{} 在实体类中通过get()方法获取属性的值
     */
    @Insert("INSERT INTO weibo(content,created,user_id) VALUES (#{content},#{created},#{userId})")
    int insertWeibo(Weibo weibo);

    /**
     * 2.根据微博 id 删除1条数据
     */
    @Delete("DELETE FROM blog.weibo WHERE id=#{id}")
    int deleteWeiboById(int id);

    @Update("UPDATE blog.weibo SET content=#{content} ,created=#{created},user_id=#{userId} WHERE id=#{id}")
    int updateWeiBoById(Weibo weibo);

    @Select("SELECT id,content,created,user_id userId FROM blog.weibo WHERE id=#{id}")
    Weibo selectWeiBoById(int id);


}
