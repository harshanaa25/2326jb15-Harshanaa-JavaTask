package Day3;

import java.util.ArrayList;

public class Library {
	ArrayList<String> books = new ArrayList<>();

    void addBook(String book) {
        books.add(book);
        System.out.println(book + " added to library.");
    }

    void removeBook(String book) {
        if (books.remove(book)) {
            System.out.println(book + " removed from library.");
        } else {
            System.out.println(book + " not found.");
        }
    }

    void issueBook(String book) {
        if (books.contains(book)) {
            books.remove(book);
            System.out.println(book + " has been issued.");
        } else {
            System.out.println("Book not available.");
        }
    }

    void showBooks() {
        System.out.println("Available books: " + books);
    }

    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook("Java Basics");
        lib.addBook("OOP Concepts");
        lib.issueBook("JDBC Connectivity");
        lib.removeBook("Mysql Queries");
        lib.showBooks();
    }
}
