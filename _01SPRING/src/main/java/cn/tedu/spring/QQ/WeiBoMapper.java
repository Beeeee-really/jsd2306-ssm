package cn.tedu.spring.QQ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class WeiBoMapper {
    @Resource(name = "resMapperImpl1")
    private ResMapper resMapper;
}
