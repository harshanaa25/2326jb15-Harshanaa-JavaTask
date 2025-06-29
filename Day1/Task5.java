package Day1;

import java.util.Scanner;

public class Task5 {
	public void grade()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter ur marks");
	int a=sc.nextInt();
	if(a>90)
	{
	System.out.println("Your grade is A");
	}
	else if(a<=90 && a>75)
	{
	System.out.println("Your grade is B");
	}
	else if(a<=75 && a>50)
	{
	System.out.println("Your grade is C");
	}
	else if(a<=50 && a>35)
	{
	System.out.println("Your grade is D");
	}
	else if(a<= 35)
	{
	System.out.println("Your fail");
	}
	}
	public static void main(String[] args)
	{
		Task5 t=new Task5();
	    t.grade();
}
}