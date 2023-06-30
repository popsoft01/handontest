package banking;

/**
 * Abstract bank account class.<br>
 * <br>
 *
 * Private Variables:<br>
 * {@link #accountHolder}: AccountHolder<br>
 * {@link #accountNumber}: Long<br>
 * {@link #pin}: int<br>
 * {@link #balance}: double
 */
public abstract class Account implements AccountInterface{
	private AccountHolder accountHolder;
	private Long accountNumber;
	private int pin;
	private double balance;

	protected Account(AccountHolder accountHolder, Long accountNumber, int pin, double startingDeposit) {

	}

	public AccountHolder getAccountHolder() {
		return accountHolder;
	}

	public boolean validatePin(int attemptedPin) {
		return false;
	}

	public double getBalance() {
		return balance;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void creditAccount(double amount) {
		this.balance += amount;
	}

	public boolean debitAccount(double amount) {
		this.balance -= amount;
        return true;
	}
}
