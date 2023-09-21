import java.util.Scanner;

public class Star3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		System.out.println("Enter rows");
		int row= s.nextInt();
		int i,j,k,l;
		
		for(i=0;i<=row;i++) {
			for(j=1;j<=(i*5);j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i==3) {
				break;
			}
			for(k=1;k<=(i*3);k++) {
					System.out.print("*\n");
			}
		}
	}
}