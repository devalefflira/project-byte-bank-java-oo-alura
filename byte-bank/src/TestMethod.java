
public class TestMethod {
	public static void main(String[] args) {
		Account account_001 = new Account();
		account_001.balance = 100;
		account_001.toDeposit(50);
		System.out.println(account_001.balance);
		
		boolean managedToWithdraw = account_001.toWithdraw(20);
		System.out.println(account_001.balance);
		System.out.println(managedToWithdraw);
		
		Account account_002 = new Account();
		account_002.toDeposit(1000);
		
		if(account_002.toTransfer(300, account_001)) {
			System.out.println("The transfer was successful.");
		} else {
			System.out.println("Insufficient funds.");
		}
		
		System.out.println(account_002.balance);
		System.out.println(account_001.balance);
		
		account_001.ownerOfTheAccount = "Aleff Lira";
		System.out.println(account_001.ownerOfTheAccount);
	}
}
