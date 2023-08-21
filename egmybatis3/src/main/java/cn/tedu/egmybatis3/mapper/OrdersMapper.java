package cn.tedu.egmybatis3.mapper;

import cn.tedu.egmybatis3.pojo.entity.Orders;
import cn.tedu.egmybatis3.pojo.vo.SelectOneVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrdersMapper {
    // 1. 添加一个订单：insert
    int insert(Orders orders);
    // 2. 查询所有订单：selectAll  **全列查询**
    List<Orders> selectAll();
    // 3. 通过id查询1个订单：selectOne   **只查询订单状态和金额**
    SelectOneVO selectOne(int id);
    // 4. 通过一个id删除订单：deleteById
    int deleteById(int id);
    // 5. 通过多个id批量删除订单：deleteMany  **使用List集合方式**
    int deleteMany(List<Integer> ids);
    // 6. 根据id动态修改订单：dynamicUpdate
    int dynamicUpdate(Orders orders);
    // 7. 统计订单总数：selectCount
    int selectCount();
}
