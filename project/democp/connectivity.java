package democp;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectivity {
	public static Connection getConnection() throws Exception {
        String url = "jdbc:mysql://localhost:3306/feedback_db";
        String user = "root";
        String pass = "achu25";
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, user, pass);
    }
}

