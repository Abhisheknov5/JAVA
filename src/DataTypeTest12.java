/*
Array problem
- In an array we can not store heterogeous type values
  mean incompatible type and higher range type values,
  it leads to CE: i c t

*/
public class DataTypeTest12 {

	public static void main(String[] args) {
		int[] ia = {3,4,'a',5L,10.5,true };
		System.out.println(java.util.Arrays.toString(ia));;
	
	}

}
// Solution: for storing multiple values of different type
// we must use class
