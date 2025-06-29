package Day4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EmployeeRecord {

    static File file = new File("employees.txt");

    public static void addEmployee(String data) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
        bw.write(data);
        bw.newLine();
        bw.close();
    }

    public static void viewEmployees() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null)
            System.out.println(line);
        br.close();
    }

    public static void deleteEmployee(String id) throws IOException {
        File temp = new File("temp.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
        String line;
        while ((line = br.readLine()) != null) {
            if (!line.startsWith(id + ",")) {
                bw.write(line);
                bw.newLine();
            }
        }
        br.close();
        bw.close();
        file.delete();
        temp.renameTo(file);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1.Add  2.View  3.Delete  4.Exit");
            int ch = sc.nextInt();
            sc.nextLine(); // consume newline
            if (ch == 1) {
                System.out.print("Enter ID,Name,Dept: ");
                String data = sc.nextLine();
                addEmployee(data);
            } else if (ch == 2) {
                viewEmployees();
            } else if (ch == 3) {
                System.out.print("Enter ID to delete: ");
                String id = sc.nextLine();
                deleteEmployee(id);
            } else {
                break;
            }
        }
    }
}


