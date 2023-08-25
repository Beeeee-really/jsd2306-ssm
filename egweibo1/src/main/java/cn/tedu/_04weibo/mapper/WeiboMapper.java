package cn.tedu._04weibo.mapper;

import cn.tedu._04weibo.pojo.entity.Weibo;
import cn.tedu._04weibo.pojo.vo.WeiboDetailVO;
import cn.tedu._04weibo.pojo.vo.WeiboIndexVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WeiboMapper {
    /**
     * 发布微博功能
     * @param weibo 实体类
     * @return 受影响的数据条数
     */
    int insertWeibo(Weibo weibo);

    /**
     * 微博首页列表
     * @return List集合
     */
    List<WeiboIndexVO> selectIndex();

    /**
     * 微博详情页
     * @param id 微博id
     * @return VO
     */
    WeiboDetailVO selectById(int id);
}







