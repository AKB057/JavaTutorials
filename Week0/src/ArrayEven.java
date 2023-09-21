import java.util.Scanner;

public class ArrayEven {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
/*		System.out.println("Enter your name:");
		String name= s.nextLine();
		System.out.println(""+name);*/
		
		int flag=0,count=0;
		System.out.println("Enter your array size");
		int size= s.nextInt();
		System.out.println("Enter the values for the array");
		int array1[]= new int[size];
		int i;
		for(i=0;i<size;i++) {
			array1[i]=s.nextInt();
		}
		System.out.println("even are");
		for(i=0;i<size;i++) {
			if(array1[i]%2==0) {
				flag=1;
				count++;
		}
		}
		if(flag==1) {
			System.out.println(+array1[i]);
		}
		else {
		System.out.println("no even numbers");
		}
		System.out.println(+count);
	}
}