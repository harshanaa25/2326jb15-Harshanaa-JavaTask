package Day2;

import java.util.Scanner;

public class Task2 {
	public void myfun()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string:");
	String s=sc.nextLine().toLowerCase();
	char c[]=s.toCharArray();
	int vowel_count=0;
	int cons_count=0;
	for(int i=0;i<s.length();i++)
	{
	if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u')
	{
	vowel_count++;
	}
	else
	{
	cons_count++;
	}
	}
	System.out.println("vowels count=" +vowel_count);
	System.out.println("consonant count=" +cons_count);
	}
	public static void main(String[] args)
	{
	Task2 t=new Task2();
	System.out.println("count of vowels and consonants");
	t.myfun();
	}
}
