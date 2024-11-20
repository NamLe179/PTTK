package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO547 {
    protected Connection con;

    public DAO547() {
        try {
            String url = "jdbc:mysql://localhost:3306/garaman";
            String user = "root"; // Tài khoản MySQL của bạn
            String password = "170903"; // Mật khẩu MySQL của bạn
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
