package cn.tedu._02mybatis.mapper;

import cn.tedu._02mybatis.pojo.Comment;
import cn.tedu._02mybatis.pojo.CommentManyVO;
import cn.tedu._02mybatis.pojo.CommentOneVO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 1.增删改:int
 * 2.查询:  类  List
 */
@Mapper
public interface CommentMapper {

    /**
     * 1. 根据评论ID删除1条评论 [测试时删除id为304的评论];
     */
    //@Delete("DELETE FROM blog.comment WHERE id=#{id}")
    int deleteCommentById(int id);

    /**
     * 2. 根据评论ID修改1条评论;
     */
    //@Update("UPDATE blog.comment SET content=#{content},created=#{created},user_id=#{userId},weibo_id=#{weiboId} WHERE id=#{id}")
    int UpdateCommentById(Comment comment);

    /**
     * 3. 根据评论ID查询1条评论, 只显示 评论的内容 评论的时间 用户的id;
     */
    //@Select("SELECT content,created,user_id userId FROM blog.comment WHERE id=#{id}")
    CommentOneVO selectCommentById(int id);

    /**
     * 4. 根据用户ID查询该用户都发表过哪些评论, 需要 评论的内容  评论的时间  微博的id;
     */
    //@Select("SELECT content,created,weibo_id weiboId FROM blog.comment WHERE user_id=#{uid}")
    List<CommentManyVO> selectCommentsById(int uid);

    /**
     * 5.统计总共有多少条评论
     *   SELECT COUNT(*) FROM blog.comment
     */
    int selectCountAll();

    /**
     * 6.数组方式:根据评论id,动态删除评论表中数据
     */
    int deleteByIds1(Integer[] ids);

    /**
     * 7.集合方式:根据评论id,动态删除评论表中数据
     */
    int deleteByIds2(List<Integer> ids);

    /**
     * 8.动态修改:根据评论ID修改评论的相关内容
     */
    int dynamicUpdate(Comment comment);
}








