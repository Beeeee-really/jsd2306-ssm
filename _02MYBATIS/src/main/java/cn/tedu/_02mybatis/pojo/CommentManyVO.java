package cn.tedu._02mybatis.pojo;

import java.sql.DatabaseMetaData;
import java.util.Date;

public class CommentManyVO {
    // 评论的内容  评论的时间  微博的id
    private String content;
    private Date created;
    private Integer weiboId;

    @Override
    public String toString() {
        return "CommentManyVO{" +
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

    public Integer getWeiboId() {
        return weiboId;
    }

    public void setWeiboId(Integer weiboId) {
        this.weiboId = weiboId;
    }
}
