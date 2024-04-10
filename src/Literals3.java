// Display Literals
public class Literals3 {

	public static void main(String[] args) {
	
		System.out.println(10);  //Integer
		System.out.println(10L); //Long
		System.out.println(10.0);//double
		System.out.println(10.0F);//float
		System.out.println(true);// boolean true
		System.out.println(false);// boolean false
		System.out.println('a');
		System.out.println('1');
		//System.out.println('10');// Error
		//System.out.println('ab');//Error
		//System.out.println(");//Error
		System.out.println(' ');//char
		//System.out.println('  ');//Error
		
		System.out.println("");
		System.out.println(" ");
		System.out.println("a");//a
		System.out.println("1");//1
		System.out.println("ab");//ab
		System.out.println("10");//10
		System.out.println("abc123@abc");
		//System.out.println(a);//Error a is not a char
		//System.out.println(Hii);//Hi is not a String ->Error
		
		int a=5;
		System.out.println(a);
		String Hi="Hii";
		System.out.println(Hi);
		System.out.println(5);
		System.out.println('5');
		System.out.println("5");
		//System.out.println(null);// Error
		String S=null;
		System.out.println(S);
		
		System.out.println((String)null);
		char[] ca=null;
		//System.out.println(ca); error NPE
		//NPE:-Null Pointer Exception
		System.out.println((int)null));

	}

}
