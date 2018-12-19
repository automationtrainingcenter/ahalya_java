package bankdemoproject;

public class TestAccount {
	
	public static void main(String[] args) {
		Account sAccount = new SavingsAccount("12345", "ahalya", "chandanagar", 10000, "pan1234");
		System.out.println(sAccount);
		
		Account cAccount = new CurrentAccount("234544", "ahalya", "chandanagar", 25000, "pan1222");
		System.out.println(cAccount);
		
//		CurrentAccount ca  = (CurrentAccount)sAccount;
	}

}
