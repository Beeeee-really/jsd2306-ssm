package cn.tedu.egmaybatis1;

import cn.tedu.egmaybatis1.mapper.OrdersMapper;
import cn.tedu.egmaybatis1.pojo.Orders;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class Egmaybatis1ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private OrdersMapper ordersMapper;

    @Test
    void OrderInsertTest() {
        Orders orders = new Orders();
        orders.setState("等待买家付款");
        orders.setAmount(502.0);
        orders.setCreated(new Date());

        ordersMapper.insertOrders(orders);
    }

}
