package cn.tedu._03mvcboot02.pojo.dto;

/**
 * 插入数据功能的DTO类
 */
public class UserInsertDTO {
    private String username;
    private String password;
    private String nickname;

    @Override
    public String toString() {
        return "UserInsertDTO{" +
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






