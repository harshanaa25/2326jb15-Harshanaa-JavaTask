package Day1;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter principle amount:");
		double p=sc.nextDouble();
		System.out.print("Enter no.of.year:");
		double n=sc.nextDouble();
		System.out.print("Enter rate of interest:");
		double r=sc.nextDouble();
		if(p>0 && n>0 && r>0) {
		double percent=((p*n*r)/100);
		System.out.println("SimpleInterest percentage:"+percent);
		}
		}
}
