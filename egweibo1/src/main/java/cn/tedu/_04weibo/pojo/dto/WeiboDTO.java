package cn.tedu._04weibo.pojo.dto;

/**
 * 发布微博DTO类
 */
public class WeiboDTO {
    //API文档:微博内容content
    private String content;

    @Override
    public String toString() {
        return "WeiboDTO{" +
                "content='" + content + '\'' +
                '}';
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}






