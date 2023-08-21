package cn.tedu._02mybatis.pojo;

import java.util.Date;

/**
 * 微博VO类
 */
public class WeiboVO {
    //此功能客户端[前端]只需要3个数据:微博ID 微博内容 和 微博发布时间
    private Integer id;
    private String content;
    private Date created;

    @Override
    public String toString() {
        return "WeiboVO{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", created=" + created +
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
}






