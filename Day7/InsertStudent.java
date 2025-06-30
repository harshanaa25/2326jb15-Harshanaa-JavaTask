import java.sql.*;
class InsertStudent {
  public static void main(String[] args) {
    try {
      Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/tstdb", "root", "achu25");
      String sql = "INSERT INTO students(name, marks) VALUES(?, ?)";
      PreparedStatement ps = con.prepareStatement(sql);
      ps.setString(1, "Alice");
      ps.setInt(2, 85);
      ps.executeUpdate();
      System.out.println("Inserted.");
      con.close();
    } catch(Exception e) {
      System.out.println(e);
    }
  }
}