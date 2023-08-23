package cn.tedu._04weibo.mapper;

import cn.tedu._04weibo.pojo.entity.User;
import cn.tedu._04weibo.pojo.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    /*
        SELECT id FROM blog.user WHERE username=#{username}
        1.注册功能: 查询任意字段即可,比如id
        2.登录功能: 需要校验密码,得查询password
        3.登录成功: 跳转到网站首页,欢迎你:nickname
     */
    UserVO selectByUsername(String username);

    int insertUser(User user);
}








