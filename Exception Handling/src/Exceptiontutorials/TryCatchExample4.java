package Exceptiontutorials;

public class TryCatchExample4 {
          public static void main(String[] args) {
			try {
				String s=null;
				System.out.println(s.length());
				int a[]=new int[5];
				System.out.println(a[7]);
				int i=10;
				int j=0;
				System.out.println(i/j);
				
			}
			catch (NullPointerException e) {
				System.out.println("nullpointer excpetion occurs");
			}
			catch (ArithmeticException e) {
				System.out.println("Arithmetic exception occurs");
			}
			catch (ArrayIndexOutOfBoundsException e){
				System.out.println("ArrayIndexout of bound exception ocurrs");
			}
			
			System.out.println("run the remaining code");
		}
}
