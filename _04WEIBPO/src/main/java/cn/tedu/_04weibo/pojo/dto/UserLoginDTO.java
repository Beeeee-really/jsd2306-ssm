package cn.tedu._04weibo.pojo.dto;

/**
 * 登录功能的DTO
 */
public class UserLoginDTO {
    //API文档：用户名,密码
    private String username;
    private String password;

    @Override
    public String toString() {
        return "UserLoginDTO{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
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
}
