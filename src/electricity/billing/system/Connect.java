package electricity.billing.system;

import java.sql.*;
public class Connect {
    Connection c;
    Statement s;
    Connect() {   
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs", "root", "tathagata@123");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
