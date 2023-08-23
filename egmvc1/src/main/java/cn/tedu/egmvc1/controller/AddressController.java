package cn.tedu.egmvc1.controller;

import cn.tedu.egmvc1.mapper.AddressMapper;
import cn.tedu.egmvc1.pojo.dto.InsertAddressDTO;
import cn.tedu.egmvc1.pojo.entity.Address;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.beans.beancontext.BeanContext;

@RestController
@RequestMapping("address/")
public class AddressController {

    @Autowired(required = false)
    private AddressMapper addressMapper;

    @RequestMapping("insert")
    public String insertAddress(InsertAddressDTO insertAddressDTO){
        /*
        1.获取请求体数据
        2.复制属性[因为插入数据使用实体类]
        3.调用接口,返回响应
         */
        Address address = new Address();
        BeanUtils.copyProperties(insertAddressDTO, address);
        addressMapper.insertAddress(address);

        return "添加成功";
    }

    /**
     * 根据地址的id查询:1个收货地址的所有数据
     * @param id 地址的id
     * @return 实体类对象
     */
    @RequestMapping("selectById")
    public Address selectById(int id){
        /*
        1.调用查询接口
         */
        return addressMapper.selectById(id);
    }
}
