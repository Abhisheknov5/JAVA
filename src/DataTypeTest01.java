
public class DataTypeTest01 {

	public static void main(String[] args) {
		// 10 // ce:- ;expected
		// 10; // ce:- not a statement 
		// a=10; // ce:- can not find a symbol variable a.
		int a;
		a = 10;
		System.out.println(a);
		
		// b=20; // ce:- can not find symbol variable b.
		// System.out.println(b); // ce:- can not find symbol variable b.
		
		int c=30;
		//we can create and store value 
		//In single line/statement
		System.out.println(c);
		
		//int c=40; CE: variable c is already defined
		//System.out.println(c);
		
		c=40;
		//it is not variable creation stmt
		System.out.println(c);
		
		int d;
		// System.out.println(d);
        //CE:variable d might not have been initialized
        // In java Variables does not have garbage value
		d=50;
		System.out.println(d); // reading it.
		
		//point #1 and #2:
		int e; //type of the memory is int and size of the memory is 4 bytes
		
		//point #3:
		e=10; //type of the value and range of the value can be stored		
		//e  = 9010454584; //CE: integer number too large (not in the int range)
		//e = 10.5;  //CE: incompatible types: possible lossy conversion 
		//from double to int (not in the int range)
		
		// e=true; //CE: incompatible types: bpplean cannot be converted to int.
		// type problem.
		
		//e = "a";	//CE: incompatible types: String cannot be converted to int
		//type problem
		
		//point #4: the allowed operators
		int i1=10;
		int i2=20;
		System.out.println(i1+i2);
		System.out.println(i1<i2);
		System.out.println(i1>i2);
		//System.out.println(i1&&i2); //CE:bad operand types for binary operator.
		
		// point #5: result type
		double d1=10.5;
		System.out.println(i1+d1); // result floating point
		// int i3=i1+d1; // //CE: incompatible types: possible lossy conversion 
		// from double to int
		
	}

}
