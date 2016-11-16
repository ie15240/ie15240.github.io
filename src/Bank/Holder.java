
public class Holder {
	private int amount;
	
	public Holder(int amount) {
		this.amount = amount;
	}
	
	public void withdraw(Account account, int amount, int password) {
		if (account.isPasswordCorrect(password)) {
			if (account.withdraw(amount)) {
				this.amount += amount;
				System.out.println("출금되었습니다.");
				System.out.println("잔액은 " + account.getBalance(password) + "원입니다.");
			} else {
				System.out.println("잔액이 부족합니다.");
			}
		} else {
			System.out.println("비밀번호가 잘못되었습니다.");
		}		
	}
	
	public void deposit(Account account, int amount) {
		if (this.amount >= amount) {
			this.amount -= amount;
			int balance = account.deposit(amount);
			System.out.println("입금되었습니다.");
			System.out.println("잔액은 " + balance + "원입니다.");
		} else {
			System.out.println("소유액이 부족합니다.");
		}
	}
	
	public String getBalance(Account account, int password) {
		int balance = account.getBalance(password);
		if (balance >= 0) {
			return "잔액은 " + balance + "원입니다."; 
		} else {
			return "비밀번호가 잘못되었습니다.";
		}
	}
}
