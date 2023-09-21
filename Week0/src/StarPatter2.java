import java.util.Scanner;

public class StarPatter2 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int i,j,k=0;
		
		for(i=0;i<=5;i++) {
			for(j=0;j<=9;j++) {
				if(j>=6-i && j<=4+i && k<1) {
					System.out.print(+i);
					k=1;
				}
				else {
					System.out.print(" ");
					k=0;
				}
			}
		System.out.println();
		}
		
	}

}
