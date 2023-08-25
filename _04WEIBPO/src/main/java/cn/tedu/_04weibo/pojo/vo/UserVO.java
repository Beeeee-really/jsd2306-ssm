package cn.tedu._04weibo.pojo.vo;

import lombok.Data;

@Data
public class UserVO {
    /*
        1.注册功能: 查询任意字段即可,比如id
        2.登录功能: 需要校验密码,得查询password
        3.登录成功: 跳转到网站首页,欢迎你:nickname
     */
    private Integer id;
    private String password;
    private String nickname;
}
