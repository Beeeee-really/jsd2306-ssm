package cn.tedu._02mybatis.pojo;


import java.util.Date;

/**
 * VO类: 服务端 --->  客户端
 */
public class WeiboIndexVO {
    private String content;
    private Date created;

    @Override
    public String toString() {
        return "WeiboIndexVO{" +
                "content='" + content + '\'' +
                ", created=" + created +
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
}







