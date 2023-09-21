public class PatternJe {

	public static void main(String[] args) {
		
		int i,j;
		for(i=1;i<=6;i++) {
			for(j=1;j<=7;j++) {
				if (i==2||i==1 ||j==7 ||j==1|| i==5 && j==4 || i==6 && j==3 || i==6 && j==5) {
					System.out.print("* ");	
				}else{ 
					System.out.print("  ");
			}
		}System.out.println();
		
	    }System.out.print("* * *   * * *");

	}
}
