package cn.tedu._04weibo.mapper;

import cn.tedu._04weibo.pojo.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentMapper {
    int insert(Comment comment);
}
