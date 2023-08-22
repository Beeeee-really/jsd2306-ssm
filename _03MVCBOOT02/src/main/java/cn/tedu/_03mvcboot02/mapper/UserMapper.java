package cn.tedu._03mvcboot02.mapper;

import cn.tedu._03mvcboot02.pojo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    /**
     * 在用户表中插入1条数据接口
     * @param user 实体类对象
     * @return 受影响的数据条数
     */
    int insertUser(User user);
}







