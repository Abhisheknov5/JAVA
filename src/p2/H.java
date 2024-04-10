package p2;
import p1.F;
public class H extends F  {

	public static void main(String[] args) {
		 
		//System.out.println("a:"+F.a); //'a' has private access in F.
		//System.out.println("b:"+F.b); //'b' is not public in F. Can not be accessed from outside package.
		System.out.println("c:"+F.c); //'c' has protected access in F.
		System.out.println("d:"+F.d);
		

	}

}
