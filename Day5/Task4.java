package Day5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        HashMap<String, ArrayList<String>> enrollments = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student\n2. Enroll Course\n3. Remove Student\n4. Display All\n5. Exit");
            int ch = sc.nextInt();
            sc.nextLine(); 

            if (ch == 1) {
                System.out.print("Enter student name: ");
                String name = sc.nextLine();
                students.add(name);
                enrollments.put(name, new ArrayList<>());
            } else if (ch == 2) {
                System.out.print("Enter student name: ");
                String name = sc.nextLine();
                if (enrollments.containsKey(name)) {
                    System.out.print("Enter course name: ");
                    String course = sc.nextLine();
                    enrollments.get(name).add(course);
                }
            } else if (ch == 3) {
                System.out.print("Enter student name to remove: ");
                String name = sc.nextLine();
                students.remove(name);
                enrollments.remove(name);
            } else if (ch == 4) {
                Iterator<String> it = students.iterator();
                while (it.hasNext()) {
                    String name = it.next();
                    System.out.println(name + " -> " + enrollments.get(name));
                }
            } else {
                break;
            }
        }
        sc.close();
    }
}
