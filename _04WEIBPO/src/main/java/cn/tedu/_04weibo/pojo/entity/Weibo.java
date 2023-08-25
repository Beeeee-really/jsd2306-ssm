package cn.tedu._04weibo.pojo.entity;

import lombok.Data;

import java.util.Date;

/**
 * 微博表实体类
 */
@Data
public class Weibo {
    //微博的ID, 微博内容, 微博发布时间, 用户ID
    private Integer id;
    private String content;
    private Date created;
    private Integer userId;
}
