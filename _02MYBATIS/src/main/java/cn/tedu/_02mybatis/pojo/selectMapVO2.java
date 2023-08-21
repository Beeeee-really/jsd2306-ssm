package cn.tedu._02mybatis.pojo;

import java.util.List;

public class selectMapVO2 {
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
