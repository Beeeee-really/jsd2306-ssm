package cn.tedu._03mvcboot02.controller;

import cn.tedu._03mvcboot02.mapper.UserMapper;
import cn.tedu._03mvcboot02.pojo.dto.UserInsertDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping("v1/users/insert")
    @ResponseBody
    public String insertUser(UserInsertDTO userInsertDTO){
        /*
            1.获取请求体数据:用户名,密码,昵称
            2.存入用户表[UserMapper接口定义接口方法]
            3.返回响应
         */

        return "";
    }
}






