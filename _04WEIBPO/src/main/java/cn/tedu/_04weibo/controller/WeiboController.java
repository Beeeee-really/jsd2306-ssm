package cn.tedu._04weibo.controller;

import cn.tedu._04weibo.common.response.JsonResult;
import cn.tedu._04weibo.common.response.StatusCode;
import cn.tedu._04weibo.mapper.WeiboMapper;
import cn.tedu._04weibo.pojo.dto.WeiboDTO;
import cn.tedu._04weibo.pojo.entity.Weibo;
import cn.tedu._04weibo.pojo.vo.UserVO;
import cn.tedu._04weibo.pojo.vo.WeiboDetailVO;
import cn.tedu._04weibo.pojo.vo.WeiboIndexVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;
import springfox.documentation.spring.web.json.Json;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Api(tags = "02.微博模块")
@Slf4j
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
    @ApiOperation(value = "发布微博功能")
    @PostMapping("insert")
    public JsonResult insertWeibo(@RequestBody WeiboDTO weiboDTO, @ApiIgnore HttpSession session){
        /*
            1.判断登录状态
              1.1 未登录: return 2;
              1.2 登录状态
                  发布微博[接口方法-插入数据(实体类)]
                  返回响应 return 1;
         */
        log.debug("weiboDTO = " + weiboDTO);
        UserVO userVO = (UserVO) session.getAttribute("user");
        if (userVO == null){
            //未登录
            return new JsonResult(StatusCode.NOT_LOGIN);
        }
        //调用接口
        Weibo weibo = new Weibo();
        BeanUtils.copyProperties(weiboDTO, weibo);
        weibo.setCreated(new Date());
        weibo.setUserId(userVO.getId());
        weiboMapper.insertWeibo(weibo);

        return JsonResult.ok();
    }

    /**
     * 首页列表展示
     * @return List集合
     */
    @ApiOperation(value = "微博首页列表")
    @GetMapping("selectIndex")
    public JsonResult selectIndex(){
        /*
            1.调用接口方法查询
         */
        List<WeiboIndexVO> weiboIndexVOS = weiboMapper.selectIndex();

        return JsonResult.ok(weiboIndexVOS);
    }

    /**
     * 微博详情页功能
     * @param id 微博的id
     * @return VO
     * ApiImplicitParam注解:Knife4j注解,通过声明参数接收客户端传递的数据时使用此注解
     *   1.name参数:指定参数名称;
     *   2.value参数:指定参数描述;
     *   3.required参数:是否为必填;
     *   4.example参数:示例值,必须为字符串类型;
     *   5.dataType参数:指定类型,默认是字符串类型;
     */
    @ApiOperation(value = "微博详情功能")
    @GetMapping("selectById")
    //当有多个参数时,使用此注解:ApiImplicitParams
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name="id", value = "微博编号", required = true, example = "200", dataType = "int"),
            @ApiImplicitParam(name="username", value = "用户名", required = true)
    })
    public JsonResult selectById(int id, String username){
        /*
            1.调用接口方法查询
         */
        WeiboDetailVO weiboDetailVO = weiboMapper.selectById(id);

        return JsonResult.ok(weiboDetailVO);
    }
}








