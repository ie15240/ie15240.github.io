
public class Account {
	private int balance;
	private int password;
	
	public Account(int balance, int password) {
		this.balance = balance;
		this.password = password;
	}
	
	public boolean isPasswordCorrect(int password) {
		if (this.password == password) {
			return true;
		}
		return false;
	}
	
	public boolean withdraw(int amount) {
		if (balance >= amount) {
			balance -= amount;
			return true;
		} else {
			return false;
		}
	}
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int getBalance(int password) {
		if (isPasswordCorrect(password))
			return balance;
		else
			return -1;
	}
}
