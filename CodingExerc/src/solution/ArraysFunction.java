package solution;

import java.util.Arrays;

public class ArraysFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = { 4, 6, 7, 2, 1, 3, 5, 9, 8,1 };
		Arrays.sort(a);
		int index =Arrays.binarySearch(a, 5);
		System.out.println("the value 5 is at "+index);

	}

}
