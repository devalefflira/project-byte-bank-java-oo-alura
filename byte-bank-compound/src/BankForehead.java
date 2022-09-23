
public class BankForehead {
	
	public static void main(String[] args) {
		Client client_001 = new Client();
		client_001.name = "Aleff Lira";
		client_001.cpf = "222.222.222-22";
		client_001.occupation = "programador";
		
		
		Account account_001 = new Account();
		account_001.toDeposit(100);
		
		account_001.ownerOfTheAccount = client_001;
		System.out.println(account_001.ownerOfTheAccount.name);
	}
}
