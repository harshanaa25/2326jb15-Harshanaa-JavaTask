package Day2;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=sc.nextInt();

		int[] numbers=new int[n];
		System.out.println("Enter " + n +"numbers:");
		for(int i=0;i<n;i++)
		{
		numbers[i]=sc.nextInt();
		}
		System.out.println("In reverse");
		for(int j=n-1;j>=0;j--)
		{
		System.out.print(numbers[j]+" ");
		}
}
}