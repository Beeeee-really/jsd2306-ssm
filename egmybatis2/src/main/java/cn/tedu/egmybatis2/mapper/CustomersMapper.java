package cn.tedu.egmybatis2.mapper;

import cn.tedu.egmybatis2.pojo.entity.Customers;
import cn.tedu.egmybatis2.pojo.vo.CustomersVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomersMapper {
    /**
     * 1.在客户信息表中插入一条数据：`'0004', '13811112222', 'Tony', '成都'`
     */
    int insertCustomers(Customers customers);

    // 1. 根据客户编号查询某个客户信息，结果：`Customers`
    Customers selectByCustId(String cust_id);

    // 2. 查询所有客户的信息，结果放到 List 集合中
    List<Customers> selectAll();

    // 3. 查询指定城市的客户信息，结果集放到 List集合 中，比如查询北京的客户信息
    List<Customers> selectByCity(String address);

    // 4. 查询指定城市的客户信息，只查询 姓名`cust_name` 和 城市 `address` ，查询结果放到 `List<CustomersVO>` 中
    List<CustomersVO> selectByAddress(String address);
}
