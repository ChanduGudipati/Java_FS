package exceptionexe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExampleofException {

	public static void main(String[] args) {
		
	try {
		
	 FileOutputStream fs = new FileOutputStream(new File ("D://hello.txt"));
	 int d = 10/0;
	}catch (ArithmeticException e) {
			// TODO: handle exception
		}
	catch (FileNotFoundException e) {
		// TODO: handle exception
	}
	catch (IOException e) {
		// TODO: handle exception
	}
	
	catch (Exception e) {
		// TODO: handle exception
	}
	
	}

}
