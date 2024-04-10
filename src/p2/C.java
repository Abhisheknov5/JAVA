package p2;
import p1.A;
public class C extends A{
	// class C extends for a Sub class. 

	public static void main(String[] args) {
		// create a Object
		A a=new A();
		//System.out.println("a: "+a.a); //'a' has a private a Access. 
		//System.out.println("b: "+a.b); //'b' default is a package private.
		//System.out.println("c: "+a.c); //'c' has protected access in A.
		System.out.println("d: "+a.d);
		
		C c=new C();
		//System.out.println("a:"+c.a);//'a' has a private a Access. 
		//System.out.println("b: "+c.b);
		System.out.println("c: "+c.c); //Here c class reference using protected variable.
		System.out.println("d: "+c.d);
	}

}  
 