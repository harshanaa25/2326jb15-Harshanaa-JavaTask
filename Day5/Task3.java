package Day5;

import java.util.HashMap;

public class Task3 {
	public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Gayathri", 88);
        marks.put("Shyam", 90);
        marks.put("Arul", 76);

        int total = 0;
        for (int m : marks.values()) {
            total += m;
        }
        double avg = total / (double) marks.size();

        System.out.println("Average Marks: " + avg);
    }
}
