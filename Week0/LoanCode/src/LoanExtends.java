import java.util.Scanner;

class LoanExtends extends LoanAbstract {
	Scanner s= new Scanner(System.in);
	
	String name() {
		System.out.println("Enter your name");
		String name= s.nextLine();
		return name;
	}
		
   int getinterest() {
	
	   System.out.println("Enter the interest");
	   int getinterest= s.nextInt();
	   return getinterest;
	}
   
   int Years() {
	   System.out.println("Enter your years");
	   int Years= s.nextInt();
	   return Years;
   }
  
}

class Execution extends LoanExtends{
	
	
	public static void main(String[] args) {
		
		LoanExtends LoE= new LoanExtends();
		 
		int Prin,getint,year;
		String name;
		
		name=LoE.name();
		Prin=LoE.Principal();
		getint=LoE.getinterest();
		year=LoE.Years();
		LoE.result(Prin, getint, year, name);
	}
		
}