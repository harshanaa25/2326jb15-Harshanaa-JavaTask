package Day6;

public class BankAccount {
	private int balance = 1000;

    synchronized void withdraw(String user, int amount) {
        System.out.println(user + " is trying to withdraw $" + amount);
        if (balance >= amount) {
            try { Thread.sleep(500); } catch (Exception e) {}
            balance -= amount;
            System.out.println(user + " withdrawn $" + amount + ". Remaining: $" + balance);
        } else {
            System.out.println("Insufficient balance for " + user);
        }
    }
}

class UserThread extends Thread {
    BankAccount account;
    int amount;

    UserThread(BankAccount acc, int amt, String name) {
        super(name);
        account = acc;
        amount = amt;
    }

    public void run() {
        account.withdraw(getName(), amount);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        new UserThread(account, 400, "User-A").start();
        new UserThread(account, 600, "User-B").start();
        new UserThread(account, 300, "User-C").start();
    }
}

