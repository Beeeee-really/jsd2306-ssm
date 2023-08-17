package cn.tedu._02mybatis.mapper;

import cn.tedu._02mybatis.pojo.User;
import org.apache.ibatis.annotations.Insert;


public interface UserMapper {
    //1.插入一条数据
    @Insert("USE blog;INSERT INTO user(username,password,nickname,created) VALUES(#{username},#{password},#{nickname},#{created});")
    void insert(User user);
}
