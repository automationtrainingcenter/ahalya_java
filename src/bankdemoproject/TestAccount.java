package bankdemoproject;

public class TestAccount {
	
	public static void main(String[] args) {
		Account sAccount = new SavingsAccount("12345", "ahalya", "chandanagar", 10000, "pan1234");
		System.out.println(sAccount);
		sAccount.withdraw(2000);
		Account cAccount = new CurrentAccount("234544", "ahalya", "chandanagar", 25000, "pan1222");
		System.out.println(cAccount);
		cAccount.withdraw(20000);
		
//		CurrentAccount ca  = (CurrentAccount)sAccount;
	}

}
