
public class TestReferences {
	public static void main(String[] args) {
		
		Account account_001 = new Account();
		account_001.balance = 300;
		System.out.println("The balance of account_001 is: " + 
		account_001.balance);
		
		Account account_002 = account_001;
		System.out.println("The balance of account_002 is: " + 
		account_002.balance);
		
		account_002.balance += 100;
		System.out.println("The balance of account_002 is: " + 
		account_002.balance);
		
		if (account_001 == account_002) {
			System.out.println("É a mesma coisa");
		}
		
		System.out.println(account_001);
		System.out.println(account_002);
	}
}
