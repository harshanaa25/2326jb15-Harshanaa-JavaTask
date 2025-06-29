package Day1;
import java.io.*;

public class Task3{
	public void leap()
	{
		int year=2025;
		if(year%4==0 && ((year%100)!=0) || (year%400==0))
		{
		System.out.println(year+"is a leap year");
		}
	else
{
		System.out.println(year+"is not a leap year");
}
}
public static void main(String[] args)
{
Task3 m=new Task3();
m.leap();
}
}