package banking;

import java.util.LinkedHashMap;

/**
 * Private Variables:<br>
 * {@link #accounts}: List&lt;Long, Account&gt;
 */
public class Bank implements BankInterface {

	private LinkedHashMap<Long, Account> accounts;

	public Bank() {
	}

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		return 0L;
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		return 0L;
	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		return false;
	}

	public double getBalance(Long accountNumber) {
		return 0L;
	}

	public void credit(Long accountNumber, double amount) {
	}

	public boolean debit(Long accountNumber, double amount) {
		return false;
	}
}
