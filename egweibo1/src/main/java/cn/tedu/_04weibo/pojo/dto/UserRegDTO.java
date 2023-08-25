package cn.tedu._04weibo.pojo.dto;

/**
 * 注册功能DTO类
 */
public class UserRegDTO {
    //依据API文档,属性有 用户名,密码,昵称
    private String username;
    private String password;
    private String nickname;

    @Override
    public String toString() {
        return "UserRegDTO{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
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
}





