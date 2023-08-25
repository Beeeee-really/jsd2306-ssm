package cn.tedu._04weibo.pojo.dto;

/**
 * 发布评论功能的DTO类
 */
public class CommentDTO {
    //API文档:微博的id,评论的内容
    private Integer id;
    private String content;

    @Override
    public String toString() {
        return "CommentDTO{" +
                "id=" + id +
                ", content='" + content + '\'' +
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
}
