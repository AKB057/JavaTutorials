
public class ImplementM implements A,B {
	
	public void display() {
		System.out.println("\nHellooooo");
	}
	
	public void nextdisplay() {
		System.out.println("Mr.Perrera");
	}
	
	public void newdisplay() {
		System.out.println("\t \tCID escape!!!!!!!!!!!!!!!");
	}
		
}

class test extends ImplementM{
	public static void main(String[] args) {
		
		ImplementM x=new ImplementM();
		x.display();
		x.nextdisplay();
		x.newdisplay();
}
}
