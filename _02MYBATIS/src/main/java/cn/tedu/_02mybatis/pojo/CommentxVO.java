package cn.tedu._02mybatis.pojo;

import java.util.Date;

public class CommentxVO {
    private String content;
    private Date created;
    private int userId;

    @Override
    public String toString() {
        return "CommentxVO{" +
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
