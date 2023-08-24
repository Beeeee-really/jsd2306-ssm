package cn.tedu._04weibo.mapper;

import cn.tedu._04weibo.pojo.entity.Comment;
import cn.tedu._04weibo.pojo.vo.CommentVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {
    /**
     * 发布评论功能
     * @param comment 评论表的实体类
     * @return 受影响的数据条数
     */
    int insert(Comment comment);

    /**
     * 获取指定微博的所有评论
     * @param id 微博的id
     * @return List集合
     */
    List<CommentVO> selectByWeiboId(int id);
}
