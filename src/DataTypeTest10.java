// Below Program explain above points
public class DataTypeTest10 {

	public static void main(String[] args) {
		int i1=5; //this code is static nature code.
		int i2=6; //because every time we must modify this code.
		int i3=7; //by adding or removing number of values.
		int i4=8; //based on the number of values we are changing.
		int i5=9;
		int i6=10; //also we must modify the sopln() statements statements
		int i7=11; //According to number of variables.
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);
		System.out.println(i7);
		
		//m1();
		m1(3);
		//m1(3, 4);

	}//main close					//the other problem with PV
									//as a method paramter is it can accepts
	static void m1(int p) {			//only one argument(value)

	}								//for accepting 0-n number of values
}									//we must modify method parameter 
									//accordingly 

									//again this method with PV as parameter
									//is static nature code

//Solution to PV: for storing multiple values as one group with single variable name
//and to pass multiple values as one group to a method with single parameter, 
//we must use RDT
