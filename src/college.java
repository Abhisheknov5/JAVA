// college.java
public class college {

	public static void main(String[] args) {
		// Creating two instances
		// from the class Student for HK and BK Objects
		Student s1 = new Student(); //for HK
		Student s2 = new Student(); //for BK
		
		//initializing s1 instance with HK objects values
		s1.sno = 101;
		s1.sname = "HK";
		s1.course = "CJ";
		s1.fee = 3500;
		
		//initializing s2 instance with BK objects values
		s2.sno = 102;
		s2.sname = "BK";
		s2.course = "Acting";
		s2.fee = 4500;
		
		System.out.println("\ns1 object values");
		System.out.println("  s1.sno\t: "	+ s1.sno);
		System.out.println("  s1.sname\t: "	+ s1.sname);
		System.out.println("  s1.course\t: "+ s1.course);
		System.out.println("  s1.fee\t: "	+ s1.fee);

		System.out.println("\ns2 object values");
		System.out.println("  s2.sno\t: "	+ s2.sno);
		System.out.println("  s2.sname\t: "	+ s2.sname);
		System.out.println("  s2.course\t: "+ s2.course);
		System.out.println("  s2.fee\t: "	+ s2.fee);
	}

}
