package capstone;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FeedbackManager {
    static Scanner sc = new Scanner(System.in);
    static List<Customer> customerList = new ArrayList<>();
    static List<Feedback> feedbackList = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Customer Feedback Management ---");
            System.out.println("1. Add Customer");
            System.out.println("2. Submit Feedback");
            System.out.println("3. Update Feedback");
            System.out.println("4. Delete Feedback");
            System.out.println("5. View Feedbacks");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt(); sc.nextLine();

            try {
                switch (choice) {
                    case 1: addCustomer(); break;
                    case 2: submitFeedback(); break;
                    case 3: updateFeedback(); break;
                    case 4: deleteFeedback(); break;
                    case 5: viewFeedbacks(); break;
                    case 6: System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    static void addCustomer() throws Exception {
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        System.out.print("Enter location: ");
        String location = sc.nextLine();

        Customer c = new Customer(name, email, location);
        Connection con = connectivity.getConnection();
        PreparedStatement ps = con.prepareStatement("INSERT INTO Customer (name, email, location) VALUES (?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, c.getName());
        ps.setString(2, c.getEmail());
        ps.setString(3, c.getLocation());
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
            c.setId(rs.getInt(1));
        }
        customerList.add(c);
        System.out.println("Customer added successfully.");
        con.close();
    }

    static void submitFeedback() throws Exception {
        System.out.print("Enter customer ID: ");
        int cid = sc.nextInt(); sc.nextLine();
        System.out.print("Enter feedback title: ");
        String title = sc.nextLine();
        System.out.print("Enter feedback description: ");
        String desc = sc.nextLine();

        Feedback f = new Feedback(cid, title, desc);
        Connection con = connectivity.getConnection();
        PreparedStatement ps = con.prepareStatement("INSERT INTO Feedback (customer_id, title, description) VALUES (?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, f.getCustomerId());
        ps.setString(2, f.getTitle());
        ps.setString(3, f.getDescription());
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
            f.setId(rs.getInt(1));
        }
        feedbackList.add(f);
        System.out.println("Feedback submitted successfully.");
        con.close();
    }

    static void updateFeedback() throws Exception {
        System.out.print("Enter feedback ID to update: ");
        int fid = sc.nextInt(); sc.nextLine();
        System.out.print("Enter new description: ");
        String newDesc = sc.nextLine();

        Connection con = connectivity.getConnection();
        PreparedStatement ps = con.prepareStatement("UPDATE Feedback SET description=? WHERE id=?");
        ps.setString(1, newDesc);
        ps.setInt(2, fid);
        int rows = ps.executeUpdate();
        if (rows > 0) {
            for (Feedback f : feedbackList) {
                if (f.getId() == fid) {
                    f.setDescription(newDesc);
                    break;
                }
            }
            System.out.println("Feedback updated.");
        } else {
            System.out.println("Feedback not found.");
        }
        con.close();
    }

    static void deleteFeedback() throws Exception {
        System.out.print("Enter feedback ID to delete: ");
        int fid = sc.nextInt();

        Connection con = connectivity.getConnection();
        PreparedStatement ps = con.prepareStatement("DELETE FROM Feedback WHERE id=?");
        ps.setInt(1, fid);
        int rows = ps.executeUpdate();
        if (rows > 0) {
            feedbackList.removeIf(f -> f.getId() == fid);
            System.out.println("Feedback deleted.");
        } else {
            System.out.println("Feedback not found.");
        }
        con.close();
    }

    static void viewFeedbacks() throws Exception {
        System.out.print("Enter customer ID to view feedbacks: ");
        int cid = sc.nextInt();

        Connection con = connectivity.getConnection();
        PreparedStatement ps = con.prepareStatement("SELECT * FROM Feedback WHERE customer_id=?");
        ps.setInt(1, cid);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.println("\nFeedback ID: " + rs.getInt("id"));
            System.out.println("Title: " + rs.getString("title"));
            System.out.println("Description: " + rs.getString("description"));
        }
        con.close();
    }
}

