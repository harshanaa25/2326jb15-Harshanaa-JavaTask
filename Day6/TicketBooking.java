package Day6;

public class TicketBooking {
	    int seats = 5;

	    synchronized void bookTicket(String user, int wantedSeats) {
	        System.out.println(user + " trying to book " + wantedSeats + " seats.");
	        if (seats >= wantedSeats) {
	            try { Thread.sleep(1000); } catch (Exception e) {}
	            seats -= wantedSeats;
	            System.out.println(user + " successfully booked. Remaining: " + seats);
	        } else {
	            System.out.println("Sorry " + user + ", not enough seats.");
	        }
	    }
	}
	class BookingThread extends Thread {
	    TicketBooking tb;
	    int seats;
	    BookingThread(TicketBooking tb, int seats, String name) {
	        super(name);
	        this.tb = tb;
	        this.seats = seats;
	    }

	    public void run() {
	        tb.bookTicket(getName(), seats);
	    }

	    public static void main(String[] args) {
	        TicketBooking tb = new TicketBooking();
	        new BookingThread(tb, 2, "User1").start();
	        new BookingThread(tb, 3, "User2").start();
	        new BookingThread(tb, 2, "User3").start(); 
	    }
}
