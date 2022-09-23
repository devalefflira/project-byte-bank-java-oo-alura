
public class Account {
	double balance;
	int agencyNumber;
	int accountNumber;
	String ownerOfTheAccount;
	
	public void toDeposit(double depositAmount) {
		if (depositAmount <= 0) {
			return;
		}
		this.balance += depositAmount;
	}
	
	public boolean toWithdraw(double withdrawalAmount) {
		if (this.balance >= withdrawalAmount) {
			this.balance -= withdrawalAmount;
			return true;
		} else {
			System.out.println("Invalid operation");
			return false;
		}
	}
	
	public boolean toTransfer(double transferValue, Account destinationAccount) {
		if(this.balance >= transferValue) {
			this.balance -= transferValue;
			destinationAccount.toDeposit(transferValue);
			return true;
		} else {
			return false;
		}
	}
}


