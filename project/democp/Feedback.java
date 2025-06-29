package democp;

public class Feedback {
	int id, customerId;
	    String title, description;

	    public Feedback(int customerId, String title, String description) {
	        this.customerId = customerId;
	        this.title = title;
	        this.description = description;
	    }
	}

