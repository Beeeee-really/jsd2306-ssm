package cn.tedu._04weibo.pojo.vo;

import java.util.Date;

/**
 * 获取指定微博的评论的VO类
 */
public class CommentVO {
    //API文档:评论id,评论内容,评论时间,用户昵称
    private Integer id;
    private String content;
    private Date created;
    private String nickname;

    @Override
    public String toString() {
        return "CommentVO{" +
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






