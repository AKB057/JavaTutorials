import java.util.Scanner;

public class ArrayLargeSmall {

	public static void main(String[] args) {
		int i,j;
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter limit");
		int limit= s.nextInt();
		int ar[]= new int[limit];
		System.out.println("Enter values");
		for(i=0;i<limit;i++) {
			ar[i]= s.nextInt();
		}
			for(i=0;i<limit;i++) {
			if(ar[i]>ar[i+1]) {
				System.out.println("The largest number is "+ar[i]);
				break;
			}
			}for(i=0;i<limit;i++) {
			if(ar[i]<ar[i+1]) {
				System.out.println("The smallest number is"+ar[i]);
				break;
			}
			}
	}
}