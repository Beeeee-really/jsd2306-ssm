package cn.tedu._04weibo.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 微博详情页的VO类
 */
@Data
public class WeiboDetailVO {
    //API文档:微博id,微博内容,发布时间,用户昵称
    private Integer id;
    private String content;
    /*
      1.时间格式:小大小,大小小
        year  month  day  hour  minute  second
        2000-01-01 00:00:00
        2000/01/01 00:00:00
        2000年01日01日 00点00分00秒
      2.JsonFormat()注解:格式化时间
        pattern参数:指定时间格式;
        timezone参数:指定时区
     */
    @JsonFormat(pattern = "yyyy年MM月dd日 HH时mm分ss秒", timezone = "GMT+8")
    private Date created;
    private String nickname;
}








