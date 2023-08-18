package cn.tedu._02mybatis.pojo;

import java.util.Date;

/**
 * 微博实体类
 */
public class Weibo {
    //微博ID 微博内容 发布时间 用户ID
    private Integer id;
    private String content;
    private Date created;
    // userId和数据库表字段的名字不一致
    private Integer userId;

    @Override
    public String toString() {
        return "Weibo{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", created=" + created +
                ", userId=" + userId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
