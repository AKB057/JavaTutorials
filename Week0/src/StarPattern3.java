import java.util.Scanner;

public class StarPattern3 {

	public static void main(String[] args) {
		int i,j;
		Scanner s=new Scanner(System.in);
	    System.out.println("Enter your rows");
	    int row= s.nextInt();
	    
		for(i=1;i<=row;i++) {
			for(j=1;j<=(row*2-1);j++) {
				if(j<=6-i||j>=4+i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("\n");
		}

	}

}
