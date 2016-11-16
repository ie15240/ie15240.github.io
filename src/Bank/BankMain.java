
public class BankMain {
	public static void main(String[] args) {
		Account account = new Account(10000, 1234);
		Holder holder = new Holder(10000);
		
		holder.withdraw(account, 12000, 1234);
		holder.deposit(account, 15000);
		holder.deposit(account, 5000);
		holder.withdraw(account, 12000, 1235);
		holder.withdraw(account, 12000, 1234);
		
		System.out.println(holder.getBalance(account, 2234));
		System.out.println(holder.getBalance(account, 1234));
	}
}
