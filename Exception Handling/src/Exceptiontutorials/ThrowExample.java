package Exceptiontutorials;

public class ThrowExample {
	
	public static void validate(int age) {
	if (age <18) {
           throw new ArithmeticException("he is not eligible to vote");
	}
	else {
		System.out.println("Eligible to vote");
	}
	}
	public static void main(String[] args) {
		validate(13);
		System.out.println("rest of the code");
	}
	}

