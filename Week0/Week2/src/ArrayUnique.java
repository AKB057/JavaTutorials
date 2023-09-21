import java.util.Scanner;

public class ArrayUnique {

	public static void main(String[] Unique) {
		
		Scanner s= new Scanner(System.in);
		
		int i,j,k,count=0,flag=0,sum;
		System.out.println("Enter the size of the rows");
		int size= s.nextInt();
		int array1[]= new int[size];
		
		System.out.println("Enter the values");
		
		for(i=0;i<size;i++) {
			array1[i]=s.nextInt();
		}
		for(i=0;i<size;i++) {
			count=0;
			for(j=1;j<size;j++) {
				if(i!=j && array1[i]==array1[j]) {
					count++;
					break;
				}
			}
		}
		if(count==0) {
			System.out.println(+array1[i]);
		}
	}
}