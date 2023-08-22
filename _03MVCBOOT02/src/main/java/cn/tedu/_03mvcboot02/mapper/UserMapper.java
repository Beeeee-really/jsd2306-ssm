package cn.tedu._03mvcboot02.mapper;

import cn.tedu._03mvcboot02.pojo.entity.User;
import cn.tedu._03mvcboot02.pojo.vo.UserListVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     * 在用户表中插入1条数据接口
     * @param user 实体类对象
     * @return 受影响的数据条数
     */
    int insertUser(User user);

    /**
     * 查询所有用户的用户名和密码
     * @return 集合
     */
    List<UserListVO> selectUser();
}







