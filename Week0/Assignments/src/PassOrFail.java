import java.util.Scanner;

public class PassOrFail {

	public static void main(String[] args) {
		PorF obj= new PorF();
		
	}
}

class PorF{
	
	Scanner s= new Scanner(System.in);
	
	PorF(){
		System.out.println("Enter your name: ");
		String name=s.next();
		
		System.out.println("Enter the marks obtained");
		float marks=s.nextInt();
		
		if(marks>=50) {
			System.out.println("Congratulations "+name+" you have passed");
		}
		else {
			System.out.println("You have to try harder "+name+", you have failed");
		}
		
	}
}
