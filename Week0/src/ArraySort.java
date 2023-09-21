import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i,temp,j;
		
	System.out.println("Enter the size of the array:");
	int size= s.nextInt();
    int array1[]= new int[size];
    System.out.println("Enter the values for the array: ");
    for(i=0;i<size;i++) {
    	array1[i]=s.nextInt();
    }
   /* Arrays.sort(array1);*/
    
    System.out.println("The sorted array values are:");
    for(i=0;i<size;i++) {
    	for(j=i;j<size;j++) {
    		if(array1[i]>array1[j]) {
    			temp=array1[i];
    			array1[i]=array1[j];
    			array1[j]=temp;
    		}
    	}
    }
    for(i=0;i<size-1;i++) {
    		System.out.print(+array1[i]+",");
    	} 
    for(i=size-1;i<size;i++) {
		System.out.print(array1[i]);
	}  
	}
}