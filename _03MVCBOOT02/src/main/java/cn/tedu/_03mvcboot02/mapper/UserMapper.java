package cn.tedu._03mvcboot02.mapper;

import cn.tedu._03mvcboot02.pojo.dto.UserUpdateDTO;
import cn.tedu._03mvcboot02.pojo.entity.User;
import cn.tedu._03mvcboot02.pojo.vo.UserListVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//@Mapper
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

    /**
     * 删除指定用户
     * @param id 用户编号
     * @return 受影响的数据条数
     */
    int deleteUser(int id);

    /**
     * 修改指定用户信息
     * @param userUpdateDTO 用户提交的新数据
     * @return 受影响的数据条数
     */
    int updateUser(UserUpdateDTO userUpdateDTO);

    UserListVO selectById(int id);
}







