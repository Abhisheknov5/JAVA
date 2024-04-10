// Char Data Type
// Below Program to show above points
public class DataTypeTest05 {

	public static void main(String[] args) {
		//System.out.println(a); // cannot find symbol of variable a 
		System.out.println(1); // 1(int type)
		//System.out.println(@); //  <identifier> expected
		System.out.println('a');
		System.out.println('1');
		System.out.println('@');
		
		char ch1='a';
		char ch2='1';
		char ch3='@';
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println('1');
		//System.out.println('10'); // more than one character
		System.out.println('a');
		//System.out.println('ab'); // more than one character
		//System.out.println(''); // no Character
		System.out.println(' '); // One SPace Allowed
		//System.out.println('  '); // two Space not Allowed
	}

}
