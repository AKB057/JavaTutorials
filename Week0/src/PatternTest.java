import java.util.Scanner;

public class PatternTest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name of the candidate: ");
		String name= s.nextLine();
		
		System.out.println("Enter your score");
		int Write= s.nextInt();
		int Lab=s.nextInt();
		int Assign=s.nextInt();
		
		int Grade=(Write*70)/100+(Lab*20)/100+(Assign*10)/100;				
		
		System.out.println("The grade of "+name+" is "+Grade);
		
	}
}