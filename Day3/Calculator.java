package Day3;

public class Calculator {
	 int sum(int a, int b) {
	        return a + b;
	    }

	    double sum(double a, double b) {
	        return a + b;
	    }

	    public static void main(String[] args) {
	        Calculator calc = new Calculator();
	        System.out.println("Sum of ints: " + calc.sum(10, 20));
	        System.out.println("Sum of doubles: " + calc.sum(5.5, 3.3));
	    }
}
