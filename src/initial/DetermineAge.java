package initial;
import java.time.LocalDate;

public class DetermineAge {
	

public void determinceAge(LocalDate pragyanDob) {	
	int age=0;	
	int dobYearPragyan=pragyanDob.getYear();
	int currentYear=LocalDate.now().getYear();
	age=currentYear-dobYearPragyan;
	
	
	if (age==18) {
		System.out.println("Young");
	}		
	else if(age>18) {
		if(age>60) {
			System.out.println("Old");
		}
		else {
			System.out.println("adult");
		}
		
		
	}
	else 
	{
		System.out.println("minor");
	}
  }
}
