package cn.tedu._02mybatis.pojo;

import java.util.Date;

/**
 * 微博首页列表展示的VO类
 */
public class WeiboListVO {
    //用户昵称 微博内容 发布时间
    private String nickname;
    private String content;
    private Date created;

    @Override
    public String toString() {
        return "WeiboListVO{" +
                "nickname='" + nickname + '\'' +
                ", content='" + content + '\'' +
                ", created=" + created +
                '}';
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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
