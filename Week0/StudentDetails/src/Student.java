
public class Student {
	
	int roll;
	String name;
	char height;
	
	static String College="Brototype";
}
	
	class Student1 extends Student {
	
	Student1(int roll, String name,char h){

		System.out.println(roll+"\t"+name+"\t"+h+"\t"+College); 
	}
}

class StudDetails{
	public static void main(String[] args) {
		Student1 s1= new Student1(14,"Amar",'A');
		Student1 s2= new Student1(15,"Ajmal",'A');
		
	}
}
