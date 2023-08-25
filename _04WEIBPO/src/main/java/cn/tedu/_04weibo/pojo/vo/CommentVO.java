package cn.tedu._04weibo.pojo.vo;

import lombok.Data;

import java.util.Date;

/**
 * 获取指定微博的评论的VO类
 */
@Data
public class CommentVO {
    //API文档:评论id,评论内容,评论时间,用户昵称
    private Integer id;
    private String content;
    private Date created;
    private String nickname;
}






