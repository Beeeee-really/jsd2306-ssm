package cn.tedu._03mvcboot01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {

    @RequestMapping("login")
    @ResponseBody//允许以返回值的方式返回给前端
    public String login(HttpServletRequest request, HttpServletResponse response) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        return "登录成功 userName:" + username + "  password:" + password;
    }


    @RequestMapping("signup")
    @ResponseBody
    public String signup() {
        return "注册成功";
    }
}
