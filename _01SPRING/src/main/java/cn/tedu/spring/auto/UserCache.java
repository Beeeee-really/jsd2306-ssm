package cn.tedu.spring.auto;

import jdk.nashorn.internal.ir.CallNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 需要接口类型属性值注入的类
 */
@Component
public class UserCache {
    /*
    required参数：true表示必须装配成功,否则会抛出异常
                 false表示不管是否装配成功,都不会报错,一般不使用!
     */
    @Autowired(required = true)
    // value:不是类名,指的是Spring Bean对象的名称
    @Qualifier(value = "cacheImpl1")
    private Cache cache;
}





