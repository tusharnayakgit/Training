package initial;
import java.util.ArrayList;
import java.util.List;

public class PubicClassTest2 {

	public static void main(String[] args) {		
		
		//Banking Transaction
		BankAccount pragyanaccount=new BankAccount();
		pragyanaccount.name="Pragyan";
		pragyanaccount.savingBalance=5000;		
		//tushar
		BankAccount tusharAccount=new BankAccount();
		tusharAccount.name="Tushar";
		tusharAccount.savingBalance=10000;		
		//Dad account 
		BankAccount DadAccount=new BankAccount();
		DadAccount.name="Dad";
		DadAccount.savingBalance=15000;
		
		List<BankAccount> bankaccountList=new ArrayList<BankAccount>();
		bankaccountList.add(pragyanaccount);
		bankaccountList.add(tusharAccount);
		bankaccountList.add(DadAccount);
		System.out.println(bankaccountList.size());
		for(BankAccount acount :bankaccountList) {
			int dipositeamount=1000;
			acount.Diposite(dipositeamount);
			
			
		}
		
		
		
 }

}
