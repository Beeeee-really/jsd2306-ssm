package cn.tedu.egmybatis2;

import cn.tedu.egmybatis2.mapper.CustomersMapper;
import cn.tedu.egmybatis2.pojo.entity.Customers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Egmybatis2ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private CustomersMapper customersMapper;

    @Test
    void insertCustomersTest(){
        Customers customers = new Customers();
        customers.setCustId("0004");
        customers.setCustTel("13811112222");
        customers.setCustName("Tony");
        customers.setAddress("成都");
        System.out.println(customersMapper.insertCustomers(customers));
    }

    @Test
    void selectByCustIdTest(){
        System.out.println(customersMapper.selectByCustId("0001"));
    }

    @Test
    void selectAllTest(){
        System.out.println(customersMapper.selectAll());
    }

    @Test
    void selectByCityTest(){
        System.out.println(customersMapper.selectByCity("成都"));
    }

    @Test
    void selectByAddressTest(){
        System.out.println(customersMapper.selectByAddress("北京"));
    }
}
