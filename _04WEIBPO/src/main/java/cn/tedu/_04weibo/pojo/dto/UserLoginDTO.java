package cn.tedu._04weibo.pojo.dto;

import lombok.Data;

/**
 * 登录功能的DTO
 */
@Data
public class UserLoginDTO {
    //API文档：用户名,密码
    private String username;
    private String password;
}
