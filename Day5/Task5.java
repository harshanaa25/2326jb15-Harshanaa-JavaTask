package Day5;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Task5 {
	   public static void main(String[] args) throws IOException {
	        ArrayList<String> studentNames = new ArrayList<>();
	        HashMap<Integer, String> studentCourses = new HashMap<>();
	        Scanner sc = new Scanner(System.in);

	        while (true) {
	            System.out.println("\n1. Add Student\n2. Search by ID\n3. Delete by ID\n4. Save to File\n5. Exit");
	            int ch = sc.nextInt();
	            sc.nextLine();

	            if (ch == 1) {
	                System.out.print("Enter ID: ");
	                int id = sc.nextInt();
	                sc.nextLine();
	                System.out.print("Enter Name: ");
	                String name = sc.nextLine();
	                System.out.print("Enter Course: ");
	                String course = sc.nextLine();
	                studentNames.add(name);
	                studentCourses.put(id, course);
	            } else if (ch == 2) {
	                System.out.print("Enter ID: ");
	                int id = sc.nextInt();
	                if (studentCourses.containsKey(id)) {
	                    System.out.println("Course: " + studentCourses.get(id));
	                } else {
	                    System.out.println("Not Found");
	                }
	            } else if (ch == 3) {
	                System.out.print("Enter ID to delete: ");
	                int id = sc.nextInt();
	                studentCourses.remove(id);
	            } else if (ch == 4) {
	                FileWriter fw = new FileWriter("courses.txt");
	                for (Entry<Integer, String> entry : studentCourses.entrySet()) {
	                    fw.write("ID: " + entry.getKey() + ", Course: " + entry.getValue() + "\n");
	                }
	                fw.close();
	                System.out.println("Saved to courses.txt");
	            } else {
	                break;
	            }
	        }
	        sc.close();
	    }
}
