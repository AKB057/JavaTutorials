import java.util.Scanner;

public class StarMock {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int i,j,k,l;
		System.out.println("Enter the row limit");
		int row= s.nextInt();
		System.out.println();
		
		for(i=1;i<=row;i++) {
			for(j=1;j<=i;j++) {
				for(l=1;l<=i;l++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for(k=1;k<=(i*3);k++) {
					System.out.print("*");
				}
			System.out.println();
		}	
	}
}