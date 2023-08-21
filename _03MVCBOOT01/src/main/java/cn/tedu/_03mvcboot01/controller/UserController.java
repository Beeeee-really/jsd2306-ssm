package cn.tedu._03mvcboot01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping("login")
    @ResponseBody//允许以返回值的方式返回给前端
    public String login() {
        return "登录成功";
    }



    @RequestMapping("signup")
    @ResponseBody
    public String signup(){
        return "注册成功";
    }
}
