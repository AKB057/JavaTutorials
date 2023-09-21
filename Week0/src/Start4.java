import java.util.Scanner;

public class Start4 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the rows");
		int row =s.nextInt();
		int i,j,k,l;
		System.out.println();
		for(i=1;i<=row;i++) {
			for(j=1;j<=((i*3)-1);j++) {
				System.out.print("*");
			}
			System.out.println();
			for(k=1;k<=i;k++) {
				if(i==row) {
					break;
				}
				for(l=1;l<=i;l++) {
					System.out.print("*");
				}
               System.out.println();
			}
		}
	}

}