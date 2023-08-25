package cn.tedu._04weibo.pojo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 用户表实体类
 */
@Data
public class User {
    //用户ID, 用户名, 密码, 昵称, 注册时间
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private Date created;
}
