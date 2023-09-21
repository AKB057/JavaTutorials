import java.util.Scanner;

public class SimpleInterest {
	Scanner s= new Scanner(System.in);

	public static void main(String[] args) {
		SimpleInterest a= new SimpleInterest();
		a.SimpleI();
	}

	void SimpleI() {
		System.out.println("Enter your Principle Amount: ");
		int Principle= s.nextInt();
		System.out.println("Enter your number of years of investment: ");
		float Years=s.nextFloat();
		System.out.println("Enter your interest upon the investment: ");
		float Interest=s.nextFloat();
		float SI=((Principle*Years*Interest)/100);
		System.out.println("The Interest accumulated is Rs."+SI);
		float ROI=SI+Principle;
		System.out.println("Total Return On Investment is Rs."+ROI);
	}

}