package cn.tedu._04weibo.controller;

import cn.tedu._04weibo.mapper.WeiboMapper;
import cn.tedu._04weibo.pojo.dto.WeiboDTO;
import cn.tedu._04weibo.pojo.entity.Weibo;
import cn.tedu._04weibo.pojo.vo.UserVO;
import cn.tedu._04weibo.pojo.vo.WeiboDetailVO;
import cn.tedu._04weibo.pojo.vo.WeiboIndexVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("v1/weibo/")
public class WeiboController {
    //自动装配
    @Autowired
    private WeiboMapper weiboMapper;

    /**
     * 发布微博功能
     * @param weiboDTO DTO类
     * @param session 会话参数
     * @return int
     */
    @PostMapping("insert")
    public int insertWeibo(@RequestBody WeiboDTO weiboDTO, HttpSession session){
        /*
            1.判断登录状态
              1.1 未登录: return 2;
              1.2 登录状态
                  发布微博[接口方法-插入数据(实体类)]
                  返回响应 return 1;
         */
        UserVO userVO = (UserVO) session.getAttribute("user");
        if (userVO == null){
            //未登录
            return 2;
        }
        //调用接口
        Weibo weibo = new Weibo();
        BeanUtils.copyProperties(weiboDTO, weibo);
        weibo.setCreated(new Date());
        weibo.setUserId(userVO.getId());
        weiboMapper.insertWeibo(weibo);

        return 1;
    }

    /**
     * 首页列表展示
     * @return List集合
     */
    @GetMapping("selectIndex")
    public List<WeiboIndexVO> selectIndex(){
        /*
            1.调用接口方法查询
         */
        return weiboMapper.selectIndex();
    }

    @GetMapping("selectById")
    public WeiboDetailVO selectById(int id){
        /*
            1.调用接口方法查询
         */
        return weiboMapper.selectById(id);
    }
}








