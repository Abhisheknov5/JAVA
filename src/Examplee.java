
public class Examplee {
	//This variable a can be accessable from another classes 
	private static final int a=10; //How many ways we provide memory
	          // 2 ways static and new(Object)
	
	static void m1() {
		System.out.println("Ex m1");
	}


	public static void main(String[] args) { 
		System.out.println(a);
		//a=20;//Here I am trying to change the value Here
		     //I am to allow to change. By default variable is allow to change.
		System.out.println(a);
	}

}

// Now i am taking another classes Sample In that Sample class I am creating one more method. 
class Sample {
public static void main(String[] args) {
		//System.out.println(Examplee.a);
		Examplee.m1();

	}

};