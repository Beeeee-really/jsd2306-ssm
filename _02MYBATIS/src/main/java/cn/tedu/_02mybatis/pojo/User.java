package cn.tedu._02mybatis.pojo;

import java.util.Date;

/**
 * 实体类: 和数据库中user表字段做好一一映射关系
 */
public class User {
    /*
        注意:1.实体类中,字段的数量与类型必须和数据表一一对应
             2.属性名和字段名可以不一样
     */
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private Date created;

    // set() get() toString()
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", created=" + created +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}








