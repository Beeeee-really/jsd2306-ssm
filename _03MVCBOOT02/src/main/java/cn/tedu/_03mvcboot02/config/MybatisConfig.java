package cn.tedu._03mvcboot02.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration注解:标识该类为配置类,SpringBoot项目启动时,会自动加载该类;
 * MapperScan注解:
 *   1.自动扫描注解,会自动扫描指定路径下的包及子包下的接口,并自动为其添加@Mapper注解;
 *   2.如果设置了自动扫描,所有的接口上不需要再添加 @Mapper 注解;
 */
@Configuration
@MapperScan("cn.tedu._03mvcboot02")
public class MybatisConfig {
}
