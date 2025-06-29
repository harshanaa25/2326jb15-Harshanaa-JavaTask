package capstone;
import java.sql.*;

class connectivity {
    public static Connection getConnection() throws Exception
    {
    	Class.forName("com.mysql.cj.jbdc.driver1");
    	return DriverManager.getConnection("jdbc:mysql://localhost:3306/feedback_db","root","achu25");
    }
}

