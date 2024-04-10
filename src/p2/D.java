package p2;
import p1.A;
public class D extends C {

	public static void main(String[] args) {
		
		A a=new A();
		//System.out.println("a:"+a.a);
		//System.out.println("b:"+a.b);
		//System.out.println("c:"+a.c);
		System.out.println("d:"+a.d);
		
		C c=new C();
		//System.out.println("a:"+c.a);
		//System.out.println("b:"+c.b);
		//System.out.println("c:"+c.c);
		System.out.println("d:"+c.d);
		
		D d=new D();
		System.out.println("c:"+d.c);
		

	}

}
