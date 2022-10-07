package Exceptiontutorials;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class ThrowExample1 {
	public static void main(String[] args) {
		try {
			method();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		System.out.println("restof the code");
	}
	
	
	
	
	
	public static void method() throws FileNotFoundException {
		FileReader fr=new FileReader("C:\\newfolder\\abc.txt");
		 BufferedReader fileInput = new BufferedReader(fr);
		 
		 
		 throw new FileNotFoundException();  
		 
       
	}

}
