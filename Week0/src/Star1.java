import java.util.Scanner;

public class Star1 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the row limit");
		int row= s.nextInt();
		int i,j,k;
		System.out.println();
		for(i=1;i<=row;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*\n");
			}
			for(k=1;k<=i*4;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
