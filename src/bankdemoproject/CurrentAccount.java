package bankdemoproject;

public class CurrentAccount extends Account{
	private final double openBalance = 25000;
	
	public CurrentAccount(String accNum, String name, String address, double balance, String panNum) {
		super(accNum, name, address, balance, panNum);
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(String accNum, String name, String address, String aadharNum, double balance) {
		super(accNum, name, address, aadharNum, balance);
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(String accNum, String name, String address, String panNum, String aadharNum, double balance) {
		super(accNum, name, address, panNum, aadharNum, balance);
		// TODO Auto-generated constructor stub
	}
	

}
