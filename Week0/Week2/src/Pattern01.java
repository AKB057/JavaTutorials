import java.util.Scanner;

public class Pattern01{
	
	public static void main(String[] args) {
		int i,j;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter rows");
		int row= s.nextInt();
		for(i=1;i<row;i++) {
			
			for(j=1;j<row;j++) {
			 {
			       if((i+j)%2==1) {
					System.out.print("1 ");
				
				}
				else {
					System.out.print("0 ");
				}
		}
		
	}
			System.out.println();
		
}
	}
	}

