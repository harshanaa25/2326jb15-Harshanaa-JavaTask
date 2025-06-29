package capstone;
class Feedback {
    private int id;
    private int customerId;
    private String title;
    private String description;

    public Feedback(int customerId, String title, String description) {
        this.customerId = customerId;
        this.title = title;
        this.description = description;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getCustomerId() { return customerId; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}

