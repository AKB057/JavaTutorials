import java.util.Scanner;

public class ArraySortandMerge {

	public static void main(String[] args) {
		
		int i,j,k,temp=0;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the limit for the arrays");
		int limit= s.nextInt();
		
		System.out.println("Enter the values for array1");
		int array1[]= new int[limit];
		for(i=0;i<limit;i++) {
			array1[i]= s.nextInt();	
		}
		
		
		System.out.println("Enter the values for array2");
		int array2[]= new int[limit];
		for(i=0;i<limit;i++) {
			array2[i]=s.nextInt();
		}
		 k=0;
		 int sum=0;
		int b[]=new int[limit*2];
		for(i=0;i<limit;i++)
		{
			b[k]=array1[i];
			k++;
			b[k]=array2[i];
			k++;
			sum=array1[i]+array2[i];
			System.out.println(sum);
		}
		//sorting
		
		for(i=0;i<limit*2;i++)
		{
			for(j=0;j<limit*2-1;j++)
			{
				if(b[j]>b[j+1])
				{
					 temp=b[j];
					 b[j]=b[j+1];
					 b[j+1]=temp;
					
				}
				
			}
			
		}

		System.out.println("After sorting");
		System.out.println("sum of sorted array : "+sum);
	
		for(i=0;i<limit*2;i++) {
			System.out.print(b[i]+" ");
		}
		
	}

}
