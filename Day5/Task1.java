package Day5;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Gayathri");
        students.add("Shyam");
        students.add("Arul");

        Iterator<String> it = students.iterator();
        System.out.println("Student List:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
