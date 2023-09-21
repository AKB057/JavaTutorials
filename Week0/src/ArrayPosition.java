import java.util.Scanner;

public class ArrayPosition {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int i,temp;
		System.out.println("Enter size of the array: ");
		int size= s.nextInt();
		System.out.println("Enter the values for the araay");
		int array1[]= new int[size];
		for(i=0;i<size;i++) {
			array1[i]=s.nextInt();
		}
		int j=size-1;
		for(i=0;i<size/2;i++) {
				temp=array1[i];
				array1[i]=array1[j];
				array1[j]=temp;
				j--;
			}
		System.out.println("The array is");
		for(i=0;i<size;i++) {
			System.out.println(array1[i]);
		}
		}
}