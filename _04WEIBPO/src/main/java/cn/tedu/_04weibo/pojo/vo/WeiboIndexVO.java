package cn.tedu._04weibo.pojo.vo;

import lombok.Data;

/**
 * 微博首页列表展示的VO类
 */
@Data
public class WeiboIndexVO {
    //API文档:微博id,微博内容,用户昵称
    private Integer id;
    private String content;
    private String nickname;
}






