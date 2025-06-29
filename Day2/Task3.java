package Day2;

import java.util.Scanner;

public class Task3 {
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String s=sc.nextLine();
		String[] words=s.split("\\s+");
		System.out.println("The splited words are:");
		for (String word:words)
		{
		System.out.println(word);
		}
		sc.close();
		}
}
