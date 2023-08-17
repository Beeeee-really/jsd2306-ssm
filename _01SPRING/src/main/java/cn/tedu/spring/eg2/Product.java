package cn.tedu.spring.eg2;

import cn.tedu.spring.example.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Product {
    private String title;
    @Value("100")
    private Integer num;
    @Value("真好吃啊")
    private String comment;


    @Value("麻辣烫")
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", num=" + num +
                ", comment='" + comment + '\'' +
                '}';
    }
}







