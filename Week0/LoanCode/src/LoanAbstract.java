import java.util.Scanner;

abstract class LoanAbstract {
	
	
	Scanner s= new Scanner(System.in);
	
	abstract String name();
	abstract int getinterest();
	abstract int Years();
	
	int Principal() {
		
		System.out.println("Enter the Principal Amount");
		int Principal= s.nextInt();
	    return Principal;
	
	}
	void result(int Principal,int getinterest,int Years,String name ) {
		System.out.println("Hello "+name);
		int LoanInterest=(Principal*getinterest*Years)/100;
		System.out.println("Your Interest is "+LoanInterest);
}
	
}
