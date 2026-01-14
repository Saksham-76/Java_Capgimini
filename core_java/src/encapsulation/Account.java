package encapsulation;

import java.util.Scanner;

public class Account {
	private int id;
	private long balance;
	private int password;

	Account() {

	}

	Account(int id, long balance, int password) {
		this.id = id;
		this.balance = balance;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// verification
	public long getBalance() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id: ");
		int checkId = sc.nextInt();
		System.out.println("Enter the password: ");
		int checkPassword = sc.nextInt();

		if (this.id != checkId) {
			System.out.println("Your id is not correct");
			return 0;
		}
		if (this.password != checkPassword) {
			System.out.println("Your password is not correct.");
			return 0;
		}
		return this.balance;
	}

	// Validation
	public void setBalance(int balance) {
		if (balance < 0) {
			System.out.println("Enetr the valid balance");
			return;
		}
		this.balance = balance;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

}
