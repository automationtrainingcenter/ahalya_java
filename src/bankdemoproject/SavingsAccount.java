package bankdemoproject;

public class SavingsAccount extends Account {

	private final double openBalance = 10000;

	public SavingsAccount(String accNum, String name, String address, double balance, String panNum) {
			super(accNum, name, address, balance, panNum);
	}

	public SavingsAccount(String accNum, String name, String address, String aadharNum, double balance) {
		super(accNum, name, address, aadharNum, balance);
	}

	public SavingsAccount(String accNum, String name, String address, String panNum, String aadharNum, double balance) {
		super(accNum, name, address, panNum, aadharNum, balance);
	}
}
