package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcMacDemo01 {//mariadb 11.xxx
    public static void main(String[] args){
        // 自动关闭特性
        try (Connection connection = DBUtil.getConnection();){
            //第三步: 创建Statement对象
            //3.1 定义sql
            String sql="insert into tb_class(id,name,create_time) values (?,?,?)";//?代表占位符
            //3.2 对sql进行预编译并创建Statement对象
            PreparedStatement pstmt= connection.prepareStatement(sql);
            //第四步:发送sql
            //4.1 为预编译的sql中的问号赋值(?的下标从1开始)
            pstmt.setInt(1,13);
            pstmt.setString(2,"JSDTN2310");
            pstmt.setDate(3,new java.sql.Date(System.currentTimeMillis()));
            //4.2 发送sql
            // 增删改语句：executeUpdate()
            // 查询语句：executeQuery()
            int i = pstmt.executeUpdate();
            //第五步:处理结果
            System.out.println(i);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }



    }
}
