package demo;

public class BankAccount {

	private String accountNo;
	private Double balance;

	public BankAccount(String accountNo, Double balance) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public Double getBalance() {
		return balance;
	}

	public synchronized void deposit(Double amount) {
		this.balance = this.balance - amount;
	}

	public synchronized void withdraw(Double amount) {

		if (balance >= amount) {
			this.balance = this.balance - amount;
			System.out.println(this.balance);
		} else {
			System.out.println("not enought money, asked: " + amount + " but have: " + balance);
		}
	}

	@Override
	public String toString() {
		return String.format("BankAccount [accountNo=%s, balance=%s]", accountNo, balance);
	}

}
