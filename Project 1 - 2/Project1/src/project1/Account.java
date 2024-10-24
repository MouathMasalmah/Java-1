package project1;

public class Account {
	private int ID;
	private String Name;
	private long Phone;
	private double balance;
	private char choice;

	public Account() {

	}

	public Account(int id, String name, long phone, double balance, char choice) {
		this.ID = id;
		this.Name = name;
		this.Phone = phone;
		this.balance = balance;
		this.choice = choice;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public long getPhone() {
		return Phone;
	}

	public void setPhone(long phone) {
		Phone = phone;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance  = balance;
	}

	public char getChoice() {
		return choice;
	}

	public void setChoice(char choice) {
		this.choice = choice;
	}

	void addAmount() {

	}

	void withdrawAmount() {

	}

	public String toString() {
		return "Account [ID=" + ID + ", Name=" + Name + ", Phone=" + Phone + ", balance=" + balance + ", choice="
				+ choice + "]";
	}



}