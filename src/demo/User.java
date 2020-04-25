package demo;

public class User extends Thread {

	private BankAccount bankAccount;
	private String operation;
	private Double amount;

	public User(BankAccount bankAccount, String opertion, Double amount) {
		this.bankAccount = bankAccount;
		this.operation = opertion;
		this.amount = amount;
	}

	public void run() {
		if (operation.equals("deposit")) {
			bankAccount.deposit(amount);
		} else {
			bankAccount.withdraw(amount);
		}
	}

}
