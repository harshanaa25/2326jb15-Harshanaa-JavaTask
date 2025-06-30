import java.sql.*;
import java.util.*;

class StudentDBManager {
  static Connection getCon() throws Exception {
    return DriverManager.getConnection("jdbc:mysql://localhost:3306/tstdb", "root", "achu25");
  }

  static void addStudent(String name, int marks) throws Exception {
    Connection con = getCon();
    PreparedStatement ps = con.prepareStatement("INSERT INTO students(name, marks) VALUES(?, ?)");
    ps.setString(1, name);
    ps.setInt(2, marks);
    ps.executeUpdate();
    con.close();
  }

  static void viewStudents() throws Exception {
    Connection con = getCon();
    ResultSet rs = con.createStatement().executeQuery("SELECT * FROM students");
    while(rs.next())
      System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
    con.close();
  }

  static void searchStudent(String name) throws Exception {
    Connection con = getCon();
    PreparedStatement ps = con.prepareStatement("SELECT * FROM students WHERE name = ?");
    ps.setString(1, name);
    ResultSet rs = ps.executeQuery();
    while(rs.next())
      System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
    con.close();
  }

  static void deleteStudent(int id) throws Exception {
    Connection con = getCon();
    PreparedStatement ps = con.prepareStatement("DELETE FROM students WHERE id=?");
    ps.setInt(1, id);
    ps.executeUpdate();
    con.close();
  }

  public static void main(String[] args) throws Exception {
    addStudent("Alice", 85);
    addStudent("Bob", 94);
    viewStudents();
    searchStudent("Alice");
    deleteStudent(1);
    viewStudents();
  }
}