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
    /*
        ApiModelProperty注解:Knife4j注解,添加在类属性上,用于控制文档中参数的描述信息;
           value参数:指定参数描述;
           required参数:指定是否为必填项;
           example参数:指定示例值;
     */
    @ApiModelProperty(value = "用户名", required = true, example = "Lucy")
    private String username;
    @ApiModelProperty(value = "密码", required = true, example = "871016")
    private String password;
    @ApiModelProperty(value = "昵称", required = true, example = "lucy")
    private String nickname;
}





