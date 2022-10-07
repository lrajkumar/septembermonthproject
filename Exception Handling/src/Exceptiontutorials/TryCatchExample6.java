package Exceptiontutorials;

public class TryCatchExample6 {
	public static void main(String[] args) {
		try {
			try {
				int arr[]= new int[5];
				System.out.println(arr[6]);
			}	
			
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array index out of bound");
			}
			}catch (Exception e) {
				System.out.println("rub the program excluding array index out of bound error");
			}
		finally {
			System.out.println("Run Program");
		}
		
	}
	}


