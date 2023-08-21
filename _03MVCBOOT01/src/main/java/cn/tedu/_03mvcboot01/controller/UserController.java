package cn.tedu._03mvcboot01.controller;

import cn.tedu._03mvcboot01.pojo.dto.UserLoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {
    /*//方式1
    @RequestMapping("login")
    @ResponseBody//允许以返回值的方式返回给前端
    public String login(HttpServletRequest request, HttpServletResponse response) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        return "登录成功 userName:" + username + "  password:" + password;
    }*/


    /* //方式2
    @RequestMapping("login")
    @ResponseBody
    public String login(String username, String password) {
        return username + ":" + password;

    }*/


    //3.DTO获取
    @RequestMapping("login")
    @ResponseBody
    public String login(UserLoginDTO userLoginDTO) {
        String username = userLoginDTO.getUsername();
        String password = userLoginDTO.getPassword();

        return username + ":" + password;
    }


    @RequestMapping("signup")
    @ResponseBody
    public String signup() {
        return "注册成功";
    }
}
