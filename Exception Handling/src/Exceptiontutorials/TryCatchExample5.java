package Exceptiontutorials;

public class TryCatchExample5 {
	public static void main(String[] args) {
		try {
			int arr[]=new int[5];
			arr[6]=30/0;
		}
		 catch (ArrayIndexOutOfBoundsException e) {
			 System.out.println("ArrayIndexoutof bound error");
		 }
		catch (ArithmeticException e) {
			System.out.println("Arithmetic error ");
		}
		System.out.println("Run the program");
		
		
	}
}
