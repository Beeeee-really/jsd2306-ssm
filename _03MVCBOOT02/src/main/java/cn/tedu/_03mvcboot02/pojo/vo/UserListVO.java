package cn.tedu._03mvcboot02.pojo.vo;

/**
 * 查询用户列表功能的VO类
 */
public class UserListVO {
    //API文档要求:用户名,密码
    private String username;
    private String password;

    @Override
    public String toString() {
        return "UserListVO{" +
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
