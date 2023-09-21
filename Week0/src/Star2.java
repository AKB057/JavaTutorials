import java.util.Scanner;

public class Star2 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the row limit");
		int row= s.nextInt();
		int i,j,k,l;
		
		System.out.println();
		
		for(i=1;i<=row;i++) {
			for(j=1;j<=(2*(i-1)+1);j++) {
				System.out.print("*");
			}
		System.out.println();
		for(k=1;k<=i;k++) {
			for(l=1;l<=i;l++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		}
	}
}