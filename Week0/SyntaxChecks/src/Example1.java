import java.util.Scanner;

 abstract class Example1{ 
	 
	protected abstract void message();
	
     void arithmetic() {
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		int n1= s.nextInt();
		int n2= s.nextInt();
		
		int sum= n1+n2;
		
		System.out.print(+sum);
	}
}