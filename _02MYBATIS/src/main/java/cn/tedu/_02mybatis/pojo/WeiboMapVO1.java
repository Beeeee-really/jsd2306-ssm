package cn.tedu._02mybatis.pojo;

/**
 * 根据微博id查询微博内容的VO类
 * 用于演示<select>标签的 resultMap属性
 */
public class WeiboMapVO1 {
    //微博id  微博内容content  用户编号user_id
    private Integer id;
    private String content;
    private Integer userId;

    @Override
    public String toString() {
        return "WeiboMapVO1{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", userId=" + userId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}






