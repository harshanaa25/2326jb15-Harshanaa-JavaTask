import java.sql.*;
class InventoryApp {
  static Connection getCon() throws Exception {
    return DriverManager.getConnection("jdbc:mysql://localhost:3306/tstdb", "root", "achu25");
  }

  static void addProduct(String name, int qty) throws Exception {
    Connection con = getCon();
    PreparedStatement ps = con.prepareStatement("INSERT INTO products(name, qty) VALUES(?, ?)");
    ps.setString(1, name);
    ps.setInt(2, qty);
    ps.executeUpdate();
    con.close();
  }

  static void viewProducts() throws Exception {
    Connection con = getCon();
    ResultSet rs = con.createStatement().executeQuery("SELECT * FROM products");
    while(rs.next())
      System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
    con.close();
  }

  static void searchProduct(String name) throws Exception {
    Connection con = getCon();
    PreparedStatement ps = con.prepareStatement("SELECT * FROM products WHERE name = ?");
    ps.setString(1, name);
    ResultSet rs = ps.executeQuery();
    while(rs.next())
      System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
    con.close();
  }

  public static void main(String[] args) throws Exception {
    addProduct("Pen", 50);
    addProduct("Notebook", 30);
    viewProducts();
    searchProduct("Pen");
  }
}