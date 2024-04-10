// Develop a program to Display one file path on concole.
public class FilePath {

	public static void main(String[] args) {
		// System.out.println("D:\abc\xyz\data.txt");
		// error: illegal escape character
		
		System.out.println("D:\\abc\\xyz\\data.txt");//no error
		System.out.println("D:\new\text\sname.txt"); //no error 
	}

}
