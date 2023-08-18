package cn.tedu._02mybatis.pojo;

import java.util.Date;

public class WeiBoVO {
    private Integer id;
    private String content;
    private Date created;

    @Override
    public String toString() {
        return "WeiBoVO{" +
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
