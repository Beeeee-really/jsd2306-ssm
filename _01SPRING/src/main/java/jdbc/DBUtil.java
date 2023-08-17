package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    static {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        String url="jdbc:mysql://localhost:3306/jsdtn2306?serverTimezone=Asia/Shanghai&characterEncoding=utf8";
        String username="root";
        String password="root";

        return DriverManager.getConnection(url,username,password);
    }
}
