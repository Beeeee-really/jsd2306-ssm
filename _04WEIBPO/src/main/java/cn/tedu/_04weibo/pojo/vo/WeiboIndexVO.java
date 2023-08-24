package cn.tedu._04weibo.pojo.vo;

/**
 * 微博首页列表展示的VO类
 */
public class WeiboIndexVO {
    //API文档:微博id,微博内容,用户昵称
    private Integer id;
    private String content;
    private String nickname;

    @Override
    public String toString() {
        return "WeiboIndexVO{" +
                "id=" + id +
                ", content='" + content + '\'' +
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}






