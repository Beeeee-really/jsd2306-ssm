package cn.tedu._02mybatis.pojo;

import java.util.List;

/**
 * 查询指定微博id的所有评论信息，要求显示：微博id、微博内容、评论的集合List<Comment>
 */
public class WeiboMapVO3 {
    private Integer id;
    private String content;
    private List<Comment> comments;

    @Override
    public String toString() {
        return "WeiboMapVO3{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", comments=" + comments +
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

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
