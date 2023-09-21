import java.util.Scanner;

public class Crossroads {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
	System.out.println("Enter your word: ");
	String word= s.nextLine();
	String newline= "\n"+word;

	System.out.println(""+newline.repeat(8));
	}

}
