package Day6;

public class MessagePrinter implements Runnable{
	public void run() {
        System.out.println("Message from: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MessagePrinter(), "Thread-1");
        Thread t2 = new Thread(new MessagePrinter(), "Thread-2");
        t1.start();
        t2.start();
    }
}
