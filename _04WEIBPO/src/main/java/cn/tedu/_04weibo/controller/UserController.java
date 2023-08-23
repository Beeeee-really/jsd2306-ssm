package cn.tedu._04weibo.controller;

import cn.tedu._04weibo.pojo.dto.UserRegDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/users/")
public class UserController {
    @PostMapping("reg")
    public int reg(UserRegDTO userRegDTO){
        /*
            1.确认用户名是否被占用 - 查询接口
            2.被占用: 直接返回2
              未被占用: 插入数据[实体类] - 插入接口
         */

        return 1;
    }
}







