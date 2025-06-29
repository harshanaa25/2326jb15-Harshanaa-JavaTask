package Day6;

public class Numbers extends Thread {
	
	    public void run() {
	        for (int i = 1; i <= 10; i++) {
	            System.out.println("Number: " + i);
	        }
	    }

	    public static void main(String[] args) {
	        Numbers np = new Numbers();
	        np.start();
	    }
}
