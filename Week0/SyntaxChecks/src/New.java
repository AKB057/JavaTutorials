class New{
	
	 void message() {
		System.out.println("Parent Message"); 
	}
	 
}

class New2 extends New 
{	

	 void mess() {
		 super.message();
	}
	
	 void child() {

		 System.out.println("Child Message");
	 }
	
}

class Main{
	public static void main(String[] args) {
		New2 obj= new New2();
		obj.message();
		
	}
}