import java.util.Scanner;

public class Arraycounts {

	public static void main(String[] args) {
		int i,j,count;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a vlaue for limit");
		int limit= s.nextInt();
		System.out.println("Enter values for array");
		int array[]= new int[limit];
		for(i=0;i<limit;i++) {
			array[i]=s.nextInt();
		}
		System.out.println("Prime numbers are");
		for(i=0;i<limit;i++) {
			count=0;
			for(j=2;j<=array[i];j++) {
				if(array[i]%j==0) {
					count=1;
					break;
				}
		}
			if(count==0) {
				System.out.println(array[i]);
			}	
		}
	}
}