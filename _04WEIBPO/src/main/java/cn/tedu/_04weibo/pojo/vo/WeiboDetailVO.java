package cn.tedu._04weibo.pojo.vo;

import java.util.Date;

/**
 * 微博详情页的VO类
 */
public class WeiboDetailVO {
    //API文档:微博id,微博内容,发布时间,用户昵称
    private Integer id;
    private String content;
    private Date created;
    private String nickname;

    @Override
    public String toString() {
        return "WeiboDetailVO{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", created=" + created +
                ", nickname='" + nickname + '\'' +
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}








