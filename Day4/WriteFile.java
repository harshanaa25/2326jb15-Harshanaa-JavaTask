package Day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        try {
	            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
	            System.out.println("Enter text to write (type 'stop' to end):");

	            while (true) {
	                String line = sc.nextLine();
	                if (line.equalsIgnoreCase("stop")) break;
	                writer.write(line);
	                writer.newLine();
	            }
	            writer.close();
	            System.out.println("Text written to output.txt");
	        } catch (IOException e) {
	            System.out.println("Error writing to file: " + e.getMessage());
	        }
	    }
}
