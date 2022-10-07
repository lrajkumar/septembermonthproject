package Exceptiontutorials;

public class TryCatchExample3 {
	public static void main(String[] args) {
		try {
			int arr[]= new int[5];
			arr[6]=30/0;
			System.out.println(arr[6]);
			}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		}
		catch (ArrayIndexOutOfBoundsException j) {
			System.out.println("ArrayIndexout of bound occurs");
		}
		catch (Exception h) {
			System.out.println("rest of the code");
		}
	}

}
