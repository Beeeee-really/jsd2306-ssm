package cn.tedu._04weibo.controller;

import cn.tedu._04weibo.mapper.UserMapper;
import cn.tedu._04weibo.pojo.dto.UserLoginDTO;
import cn.tedu._04weibo.pojo.dto.UserRegDTO;
import cn.tedu._04weibo.pojo.entity.User;
import cn.tedu._04weibo.pojo.vo.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;

@RestController
@RequestMapping("v1/users/")
public class UserController {
    //自动装配
    @Autowired(required = false)
    private UserMapper userMapper;

    /**
     * 注册功能
     * @param userRegDTO
     * @return int
     * RequestBody注解：将客户端传递过来的JSON格式的数据封装到DTO中
     */
    @PostMapping("reg")
    public int reg(@RequestBody UserRegDTO userRegDTO){
        /*
            1.确认用户名是否被占用 - 查询接口
            2.被占用: 直接返回2
              未被占用: 插入数据[实体类] - 插入接口
         */
        //soutp + 回车
        System.out.println("userRegDTO = " + userRegDTO);
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

    @PostMapping("login")
    public int login(@RequestBody UserLoginDTO userLoginDTO, HttpSession session){
        /*
            1.判断用户名是否正确[注册中的查询接口方法];
            2.比较密码;
            3.根据实际需求返回响应;
         */
        System.out.println("userLoginDTO = " + userLoginDTO);
        UserVO userVO = userMapper.selectByUsername(userLoginDTO.getUsername());
        if (userVO == null){//用户名错误
            return 3;
        }
        //校验密码
        if (userVO.getPassword().equals(userLoginDTO.getPassword())){//登录成功
            /*
                登录成功,将该用户的会话状态保持!
             */
            session.setAttribute("user", userVO);
            return 1;
        }
        // 密码错误
        return 2;
    }

    /**
     * 获取当前用户功能
     * @param session 会话参数
     * @return userVO
     */
    @GetMapping("currentUser")
    public UserVO currentUser(HttpSession session){
        /*
            1.从session中获取当初存储的用户标识
              session: {"user": userVO}
            2.直接返回响应即可
         */
        UserVO userVO = (UserVO) session.getAttribute("user");

        /*
            userVO可能为null,也可能不为null;
            服务端无需关心是否为null,一切交由客户端去判断!
         */
        return userVO;
    }

    @GetMapping("logout")
    public void logout(HttpSession session){
        /*
            删除session会话中的标识
         */
        session.removeAttribute("user");
    }
}







