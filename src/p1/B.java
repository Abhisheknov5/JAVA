package p1;
public class B {
	public static void main(String[] args) {
		//Inside this class B We can access one class member from another class member.
		
		// Create Object
		A a=new A();
		//System.out.println("a:"+a.a);
		System.out.println("b:"+a.b);
		System.out.println("c:"+a.c);
		System.out.println("d:"+a.d);
		
		
	}

}

// My requirement is I don not want to allow int a=10; Outside 
// the what to do ? Declare as a Private.
