package fizzbuzz;

import java.util.ArrayList;

public class FizzBuzz {

	
	public static void main(String[] args) {
		int n =30;
		ArrayList al = new ArrayList<>();
		for(int i =1; i <= n;i++ ) {
			if(i%3 ==0 && i %5 ==0) {
				al.add("FizzBuzz");
			}else if (i%3 ==0) {
				al.add("Fizz");
			}else if(i %5 ==0) {
				al.add("Buzz");
			}else {
				al.add(i);
			}
		}
System.out.println(al);
	}

}
