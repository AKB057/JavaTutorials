import java.util.Scanner;

public class ArrayEvenOdd {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int i,oddcount=0,evencount=0;
		System.out.println("Enter the size of the array:");
		int limit= s.nextInt();
		int array1[]= new int[limit];
		System.out.println("Enter the values for the array:");
		for(i=0;i<limit;i++) {
			array1[i]=s.nextInt();
			
		}
		System.out.println("The even numbers in the array are");
		for(i=0;i<limit;i++) {
			if(array1[i]%2==0) {
				System.out.println(array1[i]);
				evencount++;
			}
		}
		/*System.out.println("odd ones are");
		for(i=0;i<limit;i++) {
			if(array1[i]%2==1) {
				System.out.println(array1[i]);
				oddcount++;
			}
		}
		System.out.println("The number of odd numbers are "+oddcount+" number of even numbers are "+evencount);*/
	}

}
