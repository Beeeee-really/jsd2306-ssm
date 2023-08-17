package cn.tedu.spring.scope;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Scope注解：指定实例模式,singleton为单实例[默认],prototype为多实例
 */
//@Scope("singleton")
@Scope("prototype")
@Component
public class DBConnectScope {
}
