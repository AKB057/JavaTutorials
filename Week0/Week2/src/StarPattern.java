import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
	    Scanner s= new Scanner(System.in);
	    System.out.println("Enter the row");
	    int row= s.nextInt();
	    int i,j,k;
	    
	    for(i=1;i<=row;i++) {
	    	for(j=1;j<=(i*3);j++) {
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    	if(i==row) {
	    		break;
	    	}
	    	for(k=1;k<=(i*3);k++) {
	    		
		    	System.out.print("* \n");
	    	}
	    	}
	}
}
