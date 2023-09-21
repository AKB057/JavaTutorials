import java.util.Scanner;

public class PatternX {
	
	public static void main(String[] args) {
		int i,j;
		System.out.println("Enter rows");
		Scanner s= new Scanner(System.in);
		int row=s.nextInt();
		for(i=1;i<=row;i++) {
			
			for(j=1;j<=row;j++) {
			 
			      if(i==j|| j==row+1-i ) {
					System.out.print("*");
			      }
			      else
			       {System.out.print(" ");
			    	   
			       }
	}System.out.println();
			
}
		
	}
	
}