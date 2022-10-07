package Exceptiontutorials;

public class Exceptionpropagation {
	
     public void method1() {
    	 int a=50/0;
    	 System.out.println(a);
     }
     public void method2() {
    	 method1();
     }
     public void method3() {
    	 try {
    		 method2();
    	 }
    	 catch (ArithmeticException e) {
    		 System.out.println("Arithmetic exception occurs");
    	 }
    	 	 
    	 
     }
}
