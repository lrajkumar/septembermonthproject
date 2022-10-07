package Exceptiontutorials;

public class TestException {
	public static void main(String[] args)  {
		try {
			
			checkAgeOfUser(13);
			
		}
		catch (InvalidAgeException e) {
			System.out.println("18 is the maximum age to vote");
			System.out.println("error occured" +e);
			
		}
		System.out.println("run rest of the code");
	}
	
	
	
	
	public static void checkAgeOfUser(int age) throws InvalidAgeException {
		if( age <18) {
			throw new InvalidAgeException("Cannot eligible to Vote");
		}
		else {
			System.out.println("Can Vote");
		}
		
	}

}
