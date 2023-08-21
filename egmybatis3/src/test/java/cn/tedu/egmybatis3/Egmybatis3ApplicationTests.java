package cn.tedu.egmybatis3;

import cn.tedu.egmybatis3.mapper.OrdersMapper;
import cn.tedu.egmybatis3.pojo.entity.Orders;
import cn.tedu.egmybatis3.pojo.vo.SelectOneVO;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
class Egmybatis3ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private OrdersMapper ordersMapper;

    // 1. 添加一个订单：insert
    @Test
    void insertTest(){
        Orders orders = new Orders();
        orders.setState("订单完成");
        orders.setAmount(200.88);
        orders.setCreated(new Date());
        System.out.println(ordersMapper.insert(orders));
    }
    // 2. 查询所有订单：selectAll  **全列查询**
    @Test
    void selectAllTest(){
        System.out.println(ordersMapper.selectAll());
    }
    // 3. 通过id查询1个订单：selectOne   **只查询订单状态和金额**
    @Test
    void selectOneTest(){
        System.out.println(ordersMapper.selectOne(1));
    }
    // 4. 通过一个id删除订单：deleteById
    @Test
    void deleteByIdTest(){
        System.out.println(ordersMapper.deleteById(3));
    }
    // 5. 通过多个id批量删除订单：deleteMany  **使用List集合方式**
    @Test
    void deleteManyTest(){
        ArrayList<Integer> ids = new ArrayList<>();
        ids.add(2);
        ids.add(5);
        ids.add(8);
        System.out.println(ordersMapper.deleteMany(ids));
    }
    // 6. 根据id动态修改订单：dynamicUpdate
    @Test
    void dynamicUpdateTest(){
        Orders orders = new Orders();
        orders.setId(1);
        orders.setState("订单完成");
        System.out.println(ordersMapper.dynamicUpdate(orders));
    }
    // 7. 统计订单总数：selectCount
    @Test
    void selectCountTest(){
        System.out.println(ordersMapper.selectCount());
    }

}
