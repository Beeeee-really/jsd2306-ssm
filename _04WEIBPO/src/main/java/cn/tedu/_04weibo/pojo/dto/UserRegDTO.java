package cn.tedu._04weibo.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 注册功能DTO类
 */
//@AllArgsConstructor
//@NoArgsConstructor
@Data
public class UserRegDTO {
    //依据API文档,属性有 用户名,密码,昵称
    @ApiModelProperty(value = "用户名", required = true, example = "Lucy")
    private String username;
    @ApiModelProperty(value = "密码", required = true, example = "*****")
    private String password;
    @ApiModelProperty(value = "昵称", required = true, example = "Lucy")
    private String nickname;
}





