package cn.tedu._04weibo.pojo.dto;

import lombok.Data;

/**
 * 发布评论功能的DTO类
 */
@Data
public class CommentDTO {
    //API文档:微博的id,评论的内容
    private Integer id;
    private String content;
}
