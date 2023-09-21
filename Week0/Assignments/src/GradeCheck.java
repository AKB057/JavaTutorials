import java.util.Scanner;

public class GradeCheck {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your name ");
		String name= s.next();
		
		System.out.println("Enter your marks ");
		float mark= s.nextFloat();
		
		if(mark>0 && mark<101) {
			if(mark>90) {
				System.out.println("Congratulations "+name+" you have scored A");
			}
			else if(mark>80 && mark<89) {
				System.out.println("Congratulations "+name+" you have scored B");
			}else if(mark>70 && mark<79) {
				System.out.println("Congratulations "+name+" you have scored C");
			}else if(mark>60 && mark<69) {
				System.out.println("Congratulations "+name+" you have scored D");
			}else if(mark>50 && mark<59) {
				System.out.println("Congratulations "+name+" you have scored E");
			}else if(mark<50) {
				System.out.println("You have to put in more effort "+name+" you have Failed");
			}
		}else {
			System.out.println("Invalid input of marks please enter between 1 & 100 "+name);
		}
	

}
}