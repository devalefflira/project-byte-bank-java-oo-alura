
public class CreateAccount {
	public static void main(String[] args) {
		Account account_001 = new Account();
		account_001.balance = 200;
		account_001.agencyNumber = 1000;
		System.out.println(account_001.balance);
		
		Account account_002 = new Account();
		account_002.balance = 200;
		account_001.agencyNumber = 1000;
		System.out.println(account_002.balance);
		
		System.out.println(account_001.accountNumber);
		
		if (account_001 == account_002) {
			System.out.println("É a mesma conta");
		} else {
			System.out.println("São contas diferentes");
		}
		
		System.out.println(account_001);
		System.out.println(account_002);
	}
}
