// Important point on Large Integers
// Below program explains all above points.
public class DataTypeTest03 {

	public static void main(String[] args) {
		//int i1=9010454584; //CE: integer number too large
		//int i1=9010454584L; //CE: i c t : possible lossy conversion from long to int
		//Long L1=9010454584; //CE: integer number too large
		long l2=901045458L;
		//System.out.println(9010454584); //CE: integer number too large
		System.out.println(9010454584L);
	}

}
