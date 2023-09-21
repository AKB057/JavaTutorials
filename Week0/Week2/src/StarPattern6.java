
public class StarPattern6 {
	public static void main(String[] args) {
		int i,j,k;
		
		for(i=1;i<=3;i++) {
			for(j=1;j<=(2*i+1);j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i==3)
				break;
			for(k=1;k<=(3*i);k++) {
				System.out.print("*\n");
			}
		}
		
	}

}
