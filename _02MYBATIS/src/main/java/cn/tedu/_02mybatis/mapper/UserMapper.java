package cn.tedu._02mybatis.mapper;

import cn.tedu._02mybatis.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * Mapper注解:MyBatis的注解,告诉MyBatis为此接口创建实现类
 */
@Mapper
public interface UserMapper {
    //1.插入1条数据
    //@Insert("INSERT INTO user(username,password,nickname,created) VALUES(#{username}, #{password}, #{nickname}, #{created})")
    int insert(User user);
}






