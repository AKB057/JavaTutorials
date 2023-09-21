import java.util.Scanner;

public class Arraycheck {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		System.out.println("Enter size");
		int size= s.nextInt();
		int i;
		
		System.out.println("Enter the values");
		int array[]= new int[size];
		
		for(i=1;i<=size;i++) {
			array[i]=s.nextInt();
	    }
		
		System.out.println("Valuea are");
		for(i=1;i<=size;i++) {
			System.out.println(+array[i]);
		}
	}
}