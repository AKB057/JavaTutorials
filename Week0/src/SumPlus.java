import java.util.Scanner;

public class SumPlus {
	public static void main(String[] args) {
		int i,sum;
		sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num= s.nextInt();
		
		for(i=0;i<=num;i++) {
			sum=sum+i;
		}
		System.out.println(+sum);
		
	}

}
