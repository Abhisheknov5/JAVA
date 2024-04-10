package p1;
public class A {
	private int a=10;
	int b=20;
	protected int c=30;
	public int d=40;
	public static void main(String[] args) {
		//System.out.println(a);
		//Compiler throw error
		//non static variable can not be referenced from static context.
		
		//then what should I do I must create Object.
		A a=new A();
		System.out.println(a); // Reference Variable a will be come 
							   // Local Variable will come A@4517d9a3
		
		// We can access all variable with in the class.
		System.out.println("a:"+a.a);
		System.out.println("b:"+a.b);
		System.out.println("c:"+a.c);
		System.out.println("d:"+a.d);

	}

}
