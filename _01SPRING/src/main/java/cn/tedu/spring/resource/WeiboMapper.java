package cn.tedu.spring.resource;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * DI注入类,注意添加注解
 */
@Component
public class WeiboMapper {
    /*
    1. 指定@Resource中的name参数，则根据IoC容器中Bean对象名称装配
    2. 未指定name参数时，则以属性名作为Bean对象名称进行装配
    3. 未指定name参数，属性名和Bean对象名称也不一致，则根据类型装配
     */
    //@Resource(name = "resMapperImpl1")
    //IoC容器中有2个Bean对象：resMapperImpl1  resMapperImpl2
    @Resource
    private ResMapper resMapper;
}
