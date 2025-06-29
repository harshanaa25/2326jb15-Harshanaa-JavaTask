package Day3;

public class Student {
	 String name;
	    int marks;

	    void setDetails(String n, int m) {
	        name = n;
	        marks = m;
	    }

	    void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Marks: " + marks);
	    }

	    public static void main(String[] args) {
	        Student s1 = new Student();
	        s1.setDetails("Harsha", 90);
	        s1.display();
	    }
}
