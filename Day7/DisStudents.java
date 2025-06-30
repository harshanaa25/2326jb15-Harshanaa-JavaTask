import java.sql.*;
class DisStudents {
  public static void main(String[] args) {
    try {
      Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/tstdb", "root", "achu25");
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery("SELECT * FROM students");
      while(rs.next()) {
        System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getInt("marks"));
      }
      con.close();
    } catch(Exception e) {
      System.out.println(e);
    }
  }
}