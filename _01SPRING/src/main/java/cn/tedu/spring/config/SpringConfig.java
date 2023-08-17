package cn.tedu.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//表示当前类为配置类,Spring会自动加载此类
@ComponentScan("cn.tedu.spring")//设置自动扫描，指定扫描路径，会扫描该路径以及其子包
public class SpringConfig {
    public static void main(String[] args) {
        System.out.println("qwq");
    }
}
