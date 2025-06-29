package capstone;
class Customer {
    private int id;
    private String name;
    private String email;
    private String location;

    public Customer(String name, String email, String location) {
        this.name = name;
        this.email = email;
        this.location = location;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getLocation() { return location; }
}
