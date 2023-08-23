package cn.tedu._03mvcboot02.controller;

import cn.tedu._03mvcboot02.mapper.UserMapper;
import cn.tedu._03mvcboot02.pojo.dto.UserInsertDTO;
import cn.tedu._03mvcboot02.pojo.dto.UserUpdateDTO;
import cn.tedu._03mvcboot02.pojo.entity.User;
import cn.tedu._03mvcboot02.pojo.vo.UserListVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * RestController:组合注解,等价于 @Controller注解 + @ResponseBody注解
 *   1.加完此注解,则类上无需再添加 Controller注解;
 *   2.加完此注解,所有的控制器方法上都无须再添加 @ResponseBody 注解;
 *     允许所有的控制器方法,直接以返回值形式返回给客户端数据.
 */
//@Controller
@RestController
@RequestMapping("v1/users/")
public class UserController {

    //自动装配
    //required参数: 默认为true,装配不成功会抛出异常;
    //             如果设置为false,表示装配不成功不会抛出异常.
    @Autowired(required = false)
    private UserMapper userMapper;

    @RequestMapping("insert")
    //@ResponseBody
    public String insertUser(UserInsertDTO userInsertDTO){
        /*
            1.获取请求体数据:用户名,密码,昵称
            2.存入用户表[UserMapper接口定义接口方法]
            3.返回响应
         */
        User user = new User();
        //复制属性: userInserDTO中属性 ------>   user中
        BeanUtils.copyProperties(userInsertDTO, user);
        user.setCreated(new Date());
        //调用接口方法
        userMapper.insertUser(user);

        return "添加成功";
    }

    //@RequestMapping(value = "userList", method = RequestMethod.GET)
    //@ResponseBody
    @GetMapping("userList")
    public List<UserListVO> selectUser(){
        /*
            1.调用接口方法,直接查询
         */
        return userMapper.selectUser();
    }

    @RequestMapping("delete")
    //@ResponseBody
    public String deleteUser(int id){
        /*
        1.调用接口方法,删除数据即可.
         */
        userMapper.deleteUser(id);

        return "删除成功";
    }

    @RequestMapping("update")
    //@ResponseBody
    public String updateUser(UserUpdateDTO userUpdateDTO){
        /*
         * 1.调用接口,更新数据;
         */
        userMapper.updateUser(userUpdateDTO);
        return "修改成功";
    }

    /**
     * 根据用户id查询1个用户的信息,只查询用户名和密码
     * v1/users/select/用户id
     */
    @GetMapping("select/{id}")
    public UserListVO selectById(@PathVariable int id){
        return userMapper.selectById(id);
    }

}






