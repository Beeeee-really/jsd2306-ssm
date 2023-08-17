package cn.tedu.spring.file;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@PropertySource("classpath:database.properties")
@Component
public class Database {
    @Value("${jdbc.url}")
    private String dbURL;
    @Value("${jdbc.root}")
    private String userName;
    @Value("${jdbc.password}")
    private String password;
}
