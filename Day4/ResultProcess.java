package Day4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ResultProcess {
	public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("marks.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("results.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                int m1 = Integer.parseInt(parts[1]);
                int m2 = Integer.parseInt(parts[2]);
                int m3 = Integer.parseInt(parts[3]);
                int total = m1 + m2 + m3;
                double avg = total / 3.0;
                bw.write(name + " - Total: " + total + ", Average: " + avg);
                bw.newLine();
            }
            br.close();
            bw.close();
            System.out.println("Result file created.");
        } catch (IOException e) {
            System.out.println("Error processing file.");
        }
    }
}
