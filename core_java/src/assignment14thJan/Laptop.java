package assignment14thJan;

import java.util.Scanner;

public class Laptop {
	public static void main(String[] args) {
		CheckStatus ph1 = new CheckStatus(true, 1234, 345678987);
		ph1.setPhone(4567876567l);
		System.out.println(ph1.getPhone());
	}
}

class CheckStatus {
	private boolean isLocked;
	private int password;
	private long phone;

	CheckStatus() {

	}

	CheckStatus(boolean isLocked, int password, long phone) {
		this.isLocked = isLocked;
		this.password = password;
		this.phone = phone;
	}

	public boolean getIsLocked() {
		return this.isLocked;
	}

	public void setIsLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}

	public long getPhone() {
		Scanner sc = new Scanner(System.in);
		if (isLocked == true) {
			System.out.println("Enter the password: ");
			long password = sc.nextLong();

			if (this.password != password) {
				System.out.println("Your password is incorrect.");
				return -1l;
			}
		}

		return this.phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

}
