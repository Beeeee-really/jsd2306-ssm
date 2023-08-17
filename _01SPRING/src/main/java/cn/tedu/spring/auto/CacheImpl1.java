package cn.tedu.spring.auto;
import org.springframework.stereotype.Component;

/**
 * 接口实现类中必须添加注解,由Spring框架创建Bean对象
 * Component注解：IoC容器中 Spring Bean 对象的名称
 * 注解未指定Bean对象名称,默认为 类名首字母小写:cacheImpl1
 * 也可以通过 Component注解 的value参数手动指定 Spring Bean对象的名称
 */
@Component(value = "cacheImpl1")
public class CacheImpl1 implements Cache{
}




