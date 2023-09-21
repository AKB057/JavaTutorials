import java.util.Scanner;

public class AcceptChar {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter a character: ");
		
		 char a= s.next().charAt(0);
		
		System.out.println(+a);
	}

}