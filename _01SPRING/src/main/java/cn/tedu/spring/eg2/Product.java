package cn.tedu.spring.eg2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class Product {
    @Value("qwq")
    private String title;
    @Value("1")
    private Integer num;
    @Value("sdsdd")
    private String comment;

    void see(){

    }





    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", num='" + num + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
