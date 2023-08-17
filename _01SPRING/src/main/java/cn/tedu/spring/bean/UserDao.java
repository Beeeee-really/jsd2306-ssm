package cn.tedu.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Component注解: 不属于任何一层;
 * Repository注解: 数据访问层,负责和数据库交互,将此类交由Spring框架管理;
 * Controller注解: 控制器层,负责接受请求返回响应;
 * Service注解: 业务层,负责业务逻辑处理.
 */
//@Component
//@Repository
//@Controller
@Service
public class UserDao {
    /*
    @Value注解: 属性值注入[DI],加在类属性上,又可以加载setter()方法上
               只能注入一些简单类型数据[比如字符串 整型...]
               不能注入复杂类型的数据,比如:对象类型数据
     */
    //@Value("jdbc:mysql://localhost:3306/hr")
    private String dbUrl;
    @Value("root")
    private String username;
    @Value("root")
    private String password;

    @Value("jdbc:mysql://localhost:3306/hr")
    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "dbUrl='" + dbUrl + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
