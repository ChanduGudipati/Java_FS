package solution;

public class SumOfallElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 4, 6, 7, 2, 1, 3, 5, 9, 8,1 };
		int sum =0;
		
		for(int i :a) {
			sum += i; // sum = sum +i ;
		}
		System.out.println("sum is "+sum);

	}

}
