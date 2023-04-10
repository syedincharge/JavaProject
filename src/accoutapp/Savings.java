package accoutapp;

public class Savings extends Account{
	
	
	// list the specific properties to Savings acct
	 private int safetyDepositBoxID;
	 private int safetyDepositBoxKey;
	
	
	// Constructor to initialize Savings acct properties
	
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		
		setSafetyDepositBox();
		
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
	}

	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}
	
	// list any methods specific to Savings acct
	
	 public void showInfo() {
		 System.out.println("Account Type : Savings ");
		 super.showInfo();
		 System.out.println(
				 " Your Savings Account Features "+
		         "\n Safety Deposit Box ID: "+safetyDepositBoxID +
		         "\n Safety Deposit Box Key : "+ safetyDepositBoxKey);
		
	}
	 
	 
	
	

}
