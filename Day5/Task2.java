package Day5;

import java.util.HashSet;

public class Task2 {
	 public static void main(String[] args) {
	        HashSet<String> emails = new HashSet<>();
	        emails.add("gayathri@gmail.com");
	        emails.add("shyam@gmail.com");
	        emails.add("arul@gmail.com"); 

	        System.out.println("Unique Emails:");
	        for (String email : emails) {
	            System.out.println(email);
	        }
	    }
}
