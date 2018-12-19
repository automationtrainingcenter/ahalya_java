package bankdemoproject;

public class Account {

	private String accNum;
	private String name;
	private String address;
	private String panNum;
	private String aadharNum;
	private double balance;

	public Account(String accNum, String name, String address, String panNum, String aadharNum, double balance) {
		this.accNum = accNum;
		this.name = name;
		this.address = address;
		this.panNum = panNum;
		this.balance = balance;
		this.aadharNum = aadharNum;
	}

	public Account(String accNum, String name, String address, String aadharNum, double balance) {
		this(accNum, name, address, "", aadharNum, balance);
	}

	public Account(String accNum, String name, String address, double balance, String panNum) {
		this(accNum, name, address, panNum, "", balance);
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPanNum() {
		return panNum;
	}

	public void setPanNum(String panNum) {
		this.panNum = panNum;
	}

	public String getAadharNum() {
		return aadharNum;
	}

	public void setAadharNum(String aadharNum) {
		this.aadharNum = aadharNum;
	}

	public String getAccNum() {
		return accNum;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposite(double amount) {
		if (amount > 0) {
			this.balance += amount;
			System.out.println("Transaction successfull " + amount + " deposited");
		} else {
			System.out.println("invalid amount");
		}
	}

	public double withdraw(double amount) {
		boolean flag = false;
		if (amount > 0) {
			if (this.balance >= amount) {
				this.balance -= amount;
				System.out.println("Transaction successfull");
				System.out.println("please collect your cash of " + amount);
				flag = true;
			} else {
				System.out.println("insufficent funds");
			}
		} else {
			System.out.println("invalid amount");
		}
		if (flag) {
			return amount;
		} else {
			return 0.0;
		}

	}

	@Override
	public String toString() {
		return "acc num = " + this.accNum + "\nacc name = " + this.name + "\naddress = " + this.address + "\nbalance = "
				+ this.balance + "\npan num = " + this.panNum + "\naadhar num = " + this.aadharNum;
	}

}
