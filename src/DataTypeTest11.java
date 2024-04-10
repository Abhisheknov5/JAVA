/*
Below program explains storing multiple values by using array object
as one group by using single variable name
*/
public class DataTypeTest11 {

	public static void main(String[] args) {
		int[] ia = {3,4,5,6,7};
// Array Variable   Array Object
// reading values from array object
		System.out.println(ia); // [I@4517d9a3
	/*
		System.out.println(ia[0]); //3  this sopln() statements code is
		System.out.println(ia[1]); //4  static nature code because 
		System.out.println(ia[2]); //5  when values in array are changed
		System.out.println(ia[3]); //6  we must modify these sopln() statements
		System.out.println(ia[4]); //7  According either adding or by removing
		System.out.println(ia[5]); //   RE: AIOOBE [Rule: index>=0 && <ia.length]
	*/
		for(int i=0;i<ia.length;i++) { // We must develop dynamic nature code.
			System.out.println(ia[i]); //the code must automatically adjust
			
			//with the number of values available in
			//array object

//we can also display array values by using the predefined method
//toString() which is defined in the class Arrays in the package java.util
//We must call toString() method by passing array object whose values 
//we want to display as show below
System.out.println(java.util.Arrays.toString(ia));
			
		}


	}

}
