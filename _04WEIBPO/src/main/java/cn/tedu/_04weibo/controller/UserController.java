package cn.tedu._04weibo.controller;

import cn.tedu._04weibo.mapper.UserMapper;
import cn.tedu._04weibo.pojo.dto.UserLoginDTO;
import cn.tedu._04weibo.pojo.dto.UserRegDTO;
import cn.tedu._04weibo.pojo.entity.User;
import cn.tedu._04weibo.pojo.vo.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("v1/users/")
public class UserController {
    //自动装配
    @Autowired(required = false)
    private UserMapper userMapper;

    @PostMapping("reg")
    public int reg(UserRegDTO userRegDTO){
        /*
            1.确认用户名是否被占用 - 查询接口
            2.被占用: 直接返回2
              未被占用: 插入数据[实体类] - 插入接口
         */
        UserVO userVO = userMapper.selectByUsername(userRegDTO.getUsername());
        if (userVO != null) {//用户名被占用
            return 2;
        }
        //存入数据
        User user = new User();
        BeanUtils.copyProperties(userRegDTO, user);
        user.setCreated(new Date());
        userMapper.insertUser(user);
        //注册成功
        return 1;
    }




    public int login(@RequestBody UserLoginDTO userLoginDTO){

        return 1;
    }
}







