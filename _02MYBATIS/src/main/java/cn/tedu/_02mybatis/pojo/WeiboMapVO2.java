package cn.tedu._02mybatis.pojo;

import java.util.List;

/**
 * resulMap实现多表查询的VO类
 * 查询指定用户发的所有微博信息, 要求显示: 用户id、用户昵称、该用户发的微博的集合
 */
public class WeiboMapVO2 {
    //用户id  用户昵称 该用户发的微博的集合
    private Integer id;
    private String nickname;
    private List<Weibo> weibos;

    @Override
    public String toString() {
        return "selectMapVO2{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", weibos=" + weibos +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public List<Weibo> getWeibos() {
        return weibos;
    }

    public void setWeibos(List<Weibo> weibos) {
        this.weibos = weibos;
    }
}








