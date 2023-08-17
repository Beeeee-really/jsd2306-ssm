package cn.tedu.spring.eg4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Controller
public class ShopController {
    private String name;

    public ShopController() {
        System.out.println("1:实例化");
    }

    @Value("mobilePhone")
    public void setName(String name) {
        this.name = name;
        System.out.println("2:属性赋值");
    }

    @PostConstruct
    public void init(){
        System.out.println("3:初始化");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("5:销毁");
    }
}
