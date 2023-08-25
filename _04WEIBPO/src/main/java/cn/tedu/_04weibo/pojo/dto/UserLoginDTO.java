package cn.tedu._04weibo.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 登录功能的DTO
 */
@Data
public class UserLoginDTO {
    //API文档：用户名,密码
    @ApiModelProperty(value = "用户名", required = true, example = "Lucy")
    private String username;
    @ApiModelProperty(value = "密码", required = true, example = "123456")
    private String password;
}
