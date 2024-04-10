//Below program explains all above points.
public class DataTypeTest02 {

	public static void main(String[] args) {
		System.out.println("main method");
		// boolean bo=5; //CE: int can not be converted to boolean
		
		//Approach #1: with = operator (variable assignment)
		byte b1=5;
		short s1=5;
		long l1=5;
		// m1(5); //m1(int)
		// m1(b1); //m1(byte)
		// m1(s1); //m1(short)
		// m1(l1); //m1(long)
		System.out.println();
		
		//Approach #2: by using cast Operator [(datatype)value]
		m1(5);
		m1((byte)5);
		m1((short)5);
		m1((long)5);
		System.out.println();
		
		//Approach #3: by using suffix character
		m1(5);
		
		m1(5L);
		m1(5l);
		
		//m1(5B); //CE:
		//m1(5b); //CE:
		
		//m1(5S);
		//m1(5s);
		// boolean b0=5L; //CE:long can not be converted into boolean.
		/* if we want to represent an integer value as long directly,
		 * we must suffix L/l to this integer number. With suffix L, compiler and 
		 * JVM reads this integer as long directly not as int.
		 * */
	} //main close
	/*
	Certainly! The provided Java code defines a static method named m1 that takes a byte 
	parameter. When called, it prints "byte param" to the console. The method is declared 
	with a void return type, indicating it doesn't return any value. 
	*/
	static void m1(byte b) {
		System.out.println("byte param");
		
	}
	static void m1(short s) {
		System.out.println("short param");
	}
	static void m1(int i) {
		System.out.println("int param");
	}
	static void m1(long l) {
		System.out.println("long param");
	}
}// class close
