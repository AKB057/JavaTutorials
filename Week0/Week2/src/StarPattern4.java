
public class StarPattern4 {
	public static void main(String[] args) {
		
		ArrayUnique obj= new ArrayUnique();
		

		int i,j,k;
		for(i=1;i<=3;i++) {
			for(k=1;k<=3;k++) {
				System.out.print("*\n");
			}
			for(j=0;j<=(i+2);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
