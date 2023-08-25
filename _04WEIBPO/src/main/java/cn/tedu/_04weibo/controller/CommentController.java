package cn.tedu._04weibo.controller;

import cn.tedu._04weibo.common.response.JsonResult;
import cn.tedu._04weibo.common.response.StatusCode;
import cn.tedu._04weibo.mapper.CommentMapper;
import cn.tedu._04weibo.pojo.dto.CommentDTO;
import cn.tedu._04weibo.pojo.entity.Comment;
import cn.tedu._04weibo.pojo.vo.CommentVO;
import cn.tedu._04weibo.pojo.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Api(tags = "03.评论模块")
@RestController
@RequestMapping("v1/comment/")
public class CommentController {

    @Autowired
    private CommentMapper commentMapper;

    /**
     * 发布评论功能
     * @param commentDTO
     * @param session
     * @return 整型
     */
    @ApiOperation(value = "发布评论功能")
    @PostMapping("insert")
    public JsonResult insert(@RequestBody CommentDTO commentDTO, @ApiIgnore HttpSession session){
        /*
            1.校验用户登录状态
            2.调用接口方法插入数据
            3.返回响应
         */
        UserVO userVO = (UserVO) session.getAttribute("user");
        if (userVO == null){//未登录,发布评论失败
            return new JsonResult(StatusCode.NOT_LOGIN);
        }
        //将评论相关数据存入 评论表 中
        Comment comment = new Comment();
        comment.setContent(commentDTO.getContent());
        comment.setCreated(new Date());
        comment.setUserId(userVO.getId());
        //此处:commentDTO中的id为微博id,所以要设置到comment实体类属性中
        comment.setWeiboId(commentDTO.getId());
        commentMapper.insert(comment);

        return JsonResult.ok();
    }

    /**
     * 获取指定微博的所有评论
     * @param id 微博的id
     * @return List集合
     */
    @ApiOperation(value = "获取评论功能")
    @GetMapping("selectByWeiboId")
    public JsonResult selectByWeiboID(int id){
        /*
            1.调用接口方法
         */
        List<CommentVO> commentVOS = commentMapper.selectByWeiboId(id);

        return JsonResult.ok(commentVOS);
    }

}



