// Literals, Types of Literals and Java 7v new features
public class Literals1 {

	public static void main(String[] args) {
		
		/*here 10 and 20 are literls and they are used for
		  to store in variables a and b and also used for 
		  performing addition operation 
		*/
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		System.out.println("Hello World!");
		
		//to prove literal type assign it to aict variable
		//compiler will throw error with the literal type
		
		//boolean bo1=5;
		//boolean bo2=5L;
		//boolean bo3=10.5;  
		//boolean bo4=10.5f;
		//boolean bo5='a';
		//boolean bo6="a";
		
		//boolean bo7=Literals1.class;
		//boolean bo8=String.class;
		//boolean bo9=A.class;    CE: c f s class 
		//boolean bo10=int[].class;
		//boolean bo11=int.class; //int.class is an error upto java 1.4
		
		//from java 5v onward no error it is class<Integer>
		//boolean bo12=null; //<null> means no specific type literals null does not have any specific type
		//null is of any referenced data type literal
		//it means we can store null in any type of referenced variable
		//the type for the null is decided only when we assign it to a
		//referenced variable or by using cast operator as shown below
		
		String s1=null; //now here null is of String type
		int[] ia=null; //now here null is of int[] type
		Test Literals1=null; //now here null is of Literals1 type
		
		//int i2=null;
		
		System.out.println(); //void println(){ -- } 
		System.out.println(5); //void println(int i){ -- }
		System.out.println(5.0); //void println(double d){ -- }
		//System.out.println(5, 5); //void println(RDT r) {}
		//println(char[])
		//println(String)
		//println(Object)
		System.out.println((String)null);
		//println(String)------------->null
		System.out.println((int[])null);
		//println(int[])->println(Object)-> null
		System.out.println((Literals1)null);
		//println(Literals1)-> println(Object)->null
		//System.out.println((char[])null);
		//println(char[])------------>RE: NPE
		String s2=null;
		//System.out.println(s2.toUpperCase());
		/*
		 1. NULL
		 2. null
		 3. CE
		 4. RE
		 */
	}

}
