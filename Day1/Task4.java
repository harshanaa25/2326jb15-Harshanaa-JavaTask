package Day1;

import java.util.Scanner;

public class Day4 {

	public static void Calc() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value a:");
	int a=sc.nextInt();
	System.out.println("Enter value b:");
	int b=sc.nextInt();
	System.out.println("Enter ur choice:");
	System.out.println("1.add, 2.sub, 3.mul,4.div");
	int c=sc.nextInt(); 
	switch(c)
	{
	case 1:
	{
	System.out.println("Addition:"+(a+b));
	break;
	}
	case 2:
	{
	System.out.println("Subtraction:"+(a-b));
	break;
	}
	case 3:
	{
	System.out.println("Multiplication:"+(a*b));
	break;
	}
	case 4:
	{
	System.out.println("Division:"+(a/b)); 
	break;
	}
	}
	}
	public static void main(String[] args)
	{
	Calc();
}
}