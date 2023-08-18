package cn.tedu.egmaybatis1.mapper;

import cn.tedu.egmaybatis1.pojo.Orders;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrdersMapper {
    @Insert("INSERT INTO orders(state, amount, created) VALUES (#{state},#{amount},#{created});")
    void insertOrders(Orders orders);
}
