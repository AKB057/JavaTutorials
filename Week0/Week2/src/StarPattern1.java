import java.util.Scanner;

public class StarPattern1 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the row limit");
		int row= s.nextInt();
		System.out.println();
		int i,j,k,l; 

		int c= -1;	
	for(i=1;i<=row;i++) {
		for(j=1;j<=row;j++) {
			for(k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	} 
}