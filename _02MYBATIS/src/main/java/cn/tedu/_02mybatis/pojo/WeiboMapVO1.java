package cn.tedu._02mybatis.pojo;

public class WeiboMapVO1 {
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
