package cn.tedu._02mybatis.mapper;

import cn.tedu._02mybatis.pojo.Comment;
import cn.tedu._02mybatis.pojo.CommentVO;
import cn.tedu._02mybatis.pojo.CommentxVO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface CommentMapper {
    //    @Delete("DELETE FROM blog.comment WHERE id=#{id}")
    int deleteCommentById(int id);


    //    @Update("UPDATE blog.comment SET content=#{content},created=#{created},user_id=#{userId},weibo_id=#{weiboId} WHERE id=#{id}")
    int updateCommentById(Comment comment);


    //    @Select("SELECT content,created,user_id userId FROM blog.comment WHERE id=#{id}")
    CommentxVO selectCommentById(int id);


    //    @Select("SELECT content,created,weibo_id weiboId from blog.comment WHERE user_id=#{userId}")
    List<CommentVO> selectCommentAllByUserId(int userId);


}
