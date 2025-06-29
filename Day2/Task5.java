package Day2;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] names = new String[5];
        String[] phones = new String[5];
        int count = 0;

        while (true) {
            System.out.println("\n--- Mini Address Book ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Search by Name");
            System.out.println("3. Display All");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1 && count < names.length) {
                System.out.print("Enter name: ");
                names[count] = sc.nextLine();
                System.out.print("Enter phone: ");
                phones[count] = sc.nextLine();
                count++;
                System.out.println("Contact added.");
            } else if (choice == 2) {
                System.out.print("Enter name to search: ");
                String searchName = sc.nextLine();
                boolean found = false;

                for (int i = 0; i < count; i++) {
                    if (names[i].equalsIgnoreCase(searchName)) {
                        System.out.println("Name: " + names[i]);
                        System.out.println("Phone: " + phones[i]);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Contact not found.");
                }
            } else if (choice == 3) {
                System.out.println("--- All Contacts ---");
                for (int i = 0; i < count; i++) {
                    System.out.println((i + 1) + ". " + names[i] + " - " + phones[i]);
                }
            } else if (choice == 4) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid option or address book full.");
            }
        }

        sc.close();
    }
}
