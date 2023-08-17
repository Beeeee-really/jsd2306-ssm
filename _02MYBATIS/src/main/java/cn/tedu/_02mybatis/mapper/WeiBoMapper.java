package cn.tedu._02mybatis.mapper;

import cn.tedu._02mybatis.pojo.WeiBo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WeiBoMapper {

    @Insert("INSERT INTO weibo(content,created,user_id)values (#{content},#{created},#{userId})")
    void insert(WeiBo weiBo);
}
