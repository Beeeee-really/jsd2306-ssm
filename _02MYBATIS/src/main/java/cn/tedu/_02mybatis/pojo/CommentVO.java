package cn.tedu._02mybatis.pojo;

import java.util.Date;

public class CommentVO {
    private String content;
    private Date created;
    private int weiboId;

    @Override
    public String toString() {
        return "CommentVO{" +
                "content='" + content + '\'' +
                ", created=" + created +
                ", weiboId=" + weiboId +
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

    public int getWeiboId() {
        return weiboId;
    }

    public void setWeiboId(int weiboId) {
        this.weiboId = weiboId;
    }
}
