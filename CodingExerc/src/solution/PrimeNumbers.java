package solution;

public class PrimeNumbers {

	public static void main(String[] args) {
	 int n = 100;
	 // till n you are itr 
	 for(int i = 2 ; i <= n  ; i++) {
		 // assume the number is prime
		 boolean isPrime = true;
		 //looping internal loop to check the i value is 
		 //divisable by any other element till i 
		 for(int j = 2; j <i ; j++) {
			 if(i % j == 0) {
				 isPrime =false; 
			 }
		 }
		 if(isPrime) {
			 System.out.print(i +" "); 
		 }
		 
	 }

	}

}
