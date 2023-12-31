package cn.tedu._04weibo.controller;

import cn.tedu._04weibo.mapper.CommentMapper;
import cn.tedu._04weibo.pojo.dto.CommentDTO;
import cn.tedu._04weibo.pojo.entity.Comment;
import cn.tedu._04weibo.pojo.vo.CommentVO;
import cn.tedu._04weibo.pojo.vo.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

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
    @PostMapping("insert")
    public int insert(@RequestBody CommentDTO commentDTO, HttpSession session){
        /*
            1.校验用户登录状态
            2.调用接口方法插入数据
            3.返回响应
         */
        UserVO userVO = (UserVO) session.getAttribute("user");
        if (userVO == null){//未登录,发布评论失败
            return 2;
        }
        //将评论相关数据存入 评论表 中
        Comment comment = new Comment();
        comment.setContent(commentDTO.getContent());
        comment.setCreated(new Date());
        comment.setUserId(userVO.getId());
        //此处:commentDTO中的id为微博id,所以要设置到comment实体类属性中
        comment.setWeiboId(commentDTO.getId());
        commentMapper.insert(comment);

        return 1;
    }

    /**
     * 获取指定微博的所有评论
     * @param id 微博的id
     * @return List集合
     */
    @GetMapping("selectByWeiboId")
    public List<CommentVO> selectByWeiboID(int id){
        /*
            1.调用接口方法
         */
        return commentMapper.selectByWeiboId(id);
    }

}



