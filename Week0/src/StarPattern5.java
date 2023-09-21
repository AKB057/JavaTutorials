import java.util.Scanner;

public class StarPattern5 {
	public static void main(String[] args) {
		int i,j;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter thw row limit:");
		int row= s.nextInt();
		
		for(i=0;i<=row;i++) {
			for(j=0;j<=row;j++) {
				if(j==i) {
					System.out.print("*");
					
				}else {
					System.out.print(" ");
			}
		}
			System.out.println("");
	}
	}
}