
public class MainValid {
	
	synchronized final public strictfp static void main(String... str)
	{
		System.out.println("Am I valid main method?");
		
		double k=4.3242343;
		float p=(float)k;
		
		System.out.println(k);
		System.out.println(p);
	}

}

// place of an access modifier does not matter.
// if we need only one thread to access main method we can use synchronized
// if we do not need other classes to extend we use final
// post JDK 1.5 we can use varargs in place of String[] args