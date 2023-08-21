package cn.tedu._02mybatis.pojo;

import java.util.Date;

/**
 * 获取指定微博的所有评论的VO类
 */
public class WeiboCommentVO {
    //微博内容  用户昵称 评论内容  评论时间
    private String wcontent;
    private String nickname;
    private String ccontent;
    private Date created;

    @Override
    public String toString() {
        return "WeiboCommentVO{" +
                "wcontent='" + wcontent + '\'' +
                ", nickname='" + nickname + '\'' +
                ", ccontent='" + ccontent + '\'' +
                ", created=" + created +
                '}';
    }

    public String getWcontent() {
        return wcontent;
    }

    public void setWcontent(String wcontent) {
        this.wcontent = wcontent;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCcontent() {
        return ccontent;
    }

    public void setCcontent(String ccontent) {
        this.ccontent = ccontent;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
