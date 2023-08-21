package cn.tedu._02mybatis.pojo;

import java.util.Date;

public class CommentOneVO {
    // 评论的内容 评论的时间 用户的id
    private String content;
    private Date created;
    private Integer userId;

    @Override
    public String toString() {
        return "CommentOneVO{" +
                "content='" + content + '\'' +
                ", created=" + created +
                ", userId=" + userId +
                '}';
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
