// FLoating Point Data type
// Below program explains all above points.
public class DataTypeTest04 {

	public static void main(String[] args) {
		//float f1=10.5; //cannot convert from double to float
		float f2=(float)10.5;
		float f3=10.5f;
		System.out.println(f2);
		System.out.println(f3);
		
		double d1=10.5;
		double d2=10.5d;
		System.out.println(d1);
		System.out.println(d2);
		
		//boolean b01=5; // cannot convert from int to boolean
		//boolean b02=5L; // cannot convert from long to boolean
		//boolean b02=5f; // cannot convert from float to boolean
		//boolean b03=5d; // cannot convert from double to boolean
		
		m1(5); // Calls the method m1 with an int argument, printing "int parameter i: 5".
		// m1(5.0);
		m1(5.0f);
		m1(5f);
		//m1(5d);
		
		} // main end
	/*
	 m1(int i):This method takes an integer (int) as a parameter.
	 When called, it prints a message indicating that it received an integer parameter and then prints the value of that integer.
	 */
	static void m1(int i) {
		System.out.println("int parameter i:"+i);
	}
	static void m1(float f) {
		System.out.println("flaot parameter f:"+f);
	}

}
