package demo;

public class Application {

	public static void main(String[] args) {

		BankAccount account = new BankAccount("A001", 30000.00);
		
		
		User user1 = new User(account, "deposit", 10000.00);
		User user2 = new User(account, "withdraw", 12000.00);
		User user3 = new User(account, "deposit", 14000.00);
		User user4 = new User(account, "withdraw", 13000.00);
		
		
		user1.start();
		user2.start();
		user3.start();
		user4.start();
		

		
	}

}
