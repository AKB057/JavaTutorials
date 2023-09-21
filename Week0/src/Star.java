import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		Scanner  s= new Scanner(System.in);
		System.out.println("Enter your row limit");
		int row= s.nextInt();
		
		int i,j,k;
		for(i=row;i>=1;i--) {
			for(j=1;j<=i*2;j++) {
				System.out.print("X");
			}
			System.out.println();
			System.out.print("X\n");
		}
	}
}