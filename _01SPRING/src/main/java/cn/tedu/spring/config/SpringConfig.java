package cn.tedu.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration注解:表示当前类为配置类,Spring会自动加载此类
 * ComponentScan注解:设置自动扫描,指定扫描路径,会扫描该路径以及子包
 */
@Configuration
@ComponentScan("cn.tedu.spring")
public class SpringConfig {
}
