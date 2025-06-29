package Day3;
import java.util.*;

public class BankAccount {
	double balance;
	
	void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited:" + amount);
		}
	void withdraw(double amount) {
	if(balance>=amount) {
		balance -= amount;
		System.out.println("Insufficient Balance");
	}
	}
	void showBalance() {
		System.out.println("Balance:" + balance);
	}
	public static void main(String[] args) {
		BankAccount acc=new BankAccount();
		acc.deposit(1000);
		acc.withdraw(500);
		acc.showBalance();
	}
	
}
