package initial;
import java.time.LocalDate;

public class PublicTest {

	public static void main(String[] args) {
		
		
		//Machthematic Calculation
		MathemticSolution solution=new MathemticSolution();		
		int a=30;
		int b=5;
		solution.addition(a,b);
		solution.multiplication(a,b);
		solution.subtraction(a,b);
		
		
		//Age Calculcation
		DetermineAge determineAge=new DetermineAge();
		LocalDate DadDob=LocalDate.of(1986, 02, 17);
		determineAge.determinceAge(DadDob);
		
		//Banking Transaction
		BankAccount pragyanaccount=new BankAccount();
		pragyanaccount.name="Pragyan";
		pragyanaccount.mobileNumber=123;
		pragyanaccount.savingBalance=5000;
		int amount=1000;
		int withDrawnAmount=2000;
		
		//tushar
		BankAccount tusharAccount=new BankAccount();
		tusharAccount.name="Tushar";
		tusharAccount.mobileNumber=456;
		tusharAccount.savingBalance=10000;
		int amount1=1000;
		int withDrawnAmount1=2000;		
		
		//Dad account 
		BankAccount DadAccount=new BankAccount();
		DadAccount.name="Dad";
		DadAccount.mobileNumber=987;
		DadAccount.savingBalance=15000;
		int amount2=1000;
		int withDrawnAmount2=2000;
		
		DadAccount.Diposite(amount2);
		DadAccount.WithDrawn(withDrawnAmount2);
		
		
		
		
 }

}
