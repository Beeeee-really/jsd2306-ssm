package cn.tedu._04weibo.pojo.entity;

import lombok.Data;

import java.util.Date;

/**
 * 评论表实体类
 */
@Data
public class Comment {
    //评论的id, 评论内容, 评论时间, 用户ID, 微博ID
    private Integer id;
    private String content;
    private Date created;
    private Integer userId;
    private Integer weiboId;
}
