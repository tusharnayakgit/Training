package initial;

public class BankAccount {
	 int savingBalance;
	 int commision=2;
	 String name;
	 int mobileNumber;
	
	
	
	public void Diposite(int amount) {
		
		int taxamount=(amount*commision)/100;		
		int balance=savingBalance+amount-taxamount;
		
		System.out.println(name+"Balance:"+balance);		
	}
		
	
	public void WithDrawn(int amount ) {		
		int taxamount=(amount*commision)/100;		
		int balance=savingBalance-amount-taxamount;
		System.out.println(name+"Balance:"+balance);
	}
}
