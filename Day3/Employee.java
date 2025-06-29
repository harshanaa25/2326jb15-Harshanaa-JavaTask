package Day3;
import java.util.*;

class Person {
    String name;
    int age;
}
public class Employee extends Person{
	 double salary, bonus;
	 private String name;
	 private int age;

	    double calculateSalary() {
	        return salary + bonus;
}
	    public static void main(String[] args) {
	        Employee emp = new Employee();
	        emp.name = "Gops";
	        emp.age = 19;
	        emp.salary = 25000;
	        emp.bonus = 4000;
	        System.out.println("Name: " + emp.name);
	        System.out.println("Total Salary: " + emp.calculateSalary());
	    }
	}