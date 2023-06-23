package Loops;

public class ForExample {

	public static void main(String[] args) {
		for(int i =1; i <= 10 ; i++ ) {
			System.out.println("the value of i "+i);
			if(i == 5 ) {
				break;
			}
		}
		int j =1; //11
		while (j <= 10) { // 10
			System.out.println("hello "+j);
			j ++; //11
		}
		
		//j =11
		do {
			System.out.println("hello do "+j); //11
			j ++; //12
		} while (j <= 10);// false
		

	}

}
