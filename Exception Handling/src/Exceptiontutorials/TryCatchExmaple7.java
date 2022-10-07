package Exceptiontutorials;

public class TryCatchExmaple7 {
	public static void main(String[] args) {
		try {
			int a=20;
			int b=0;
			int d=a/b;
			System.out.println(d);
		}
		catch (ArithmeticException e) {
			System.out.println("Null pointer excepton occurs");
		}
		finally {
			 System.out.println("Run the code irrespective of the exception");
		}
		System.out.println("Run the code without any devaiation");
	}

}
