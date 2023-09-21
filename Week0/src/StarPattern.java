import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your limit");
		int row= s.nextInt();
		int i,j,k;
		
		for(i=1;i<=row;i++) {
		    for(j=1;j<=(i*2);j++) {
		    	System.out.print("*");
		    }
			System.out.println();
			for(k=1;k<=i;k++) {
				System.out.print("*");
				System.out.println();
				}
			}
			
		}
	}
