
public class CreateAccount {
	public static void main(String[] args) {
		Account account_001 = new Account();
		account_001.balance = 200;
		System.out.println(account_001.balance);
		
		Account account_002 = new Account();
		account_002.balance = 100;
		System.out.println(account_002.balance);
		
		System.out.println(account_001.accountNumber);
	}
}
