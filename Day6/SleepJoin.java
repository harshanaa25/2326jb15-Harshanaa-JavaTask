package Day6;

public class SleepJoin extends Thread {
	  public void run() {
	        try {
	            for (int i = 1; i <= 3; i++) {
	                System.out.println(getName() + " - Count: " + i);
	                Thread.sleep(500); 
	            }
	        } catch (InterruptedException e) {
	            System.out.println(e);
	        }
	    }

		public static void main(String[] args) throws InterruptedException {
	        SleepJoin t1 = new SleepJoin();
	        SleepJoin t2 = new SleepJoin();
	        
	        t1.start();
	        t1.join(); 
	        t2.start();
	    }

}
