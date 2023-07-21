package solution;

public class LinearSearchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 4, 6, 7, 2, 1, 3, 5, 9, 8,1 };
		int target = 1;
		int index = linearSearch(a, target);
		if (index >= 0) {
			System.out.println("the " + target + " value is at " + index);
		} else {
			System.out.println("the " + target + " is not available");
		}

	}

	private static int linearSearch(int[] a, int target) {
		// TODO Auto-generated method stub
		int max = a.length - 1;
		for (int i = 0; i <= max; i++) {
			if (a[i] == target) {
				return i;
			}
		}
		return -1;

	}

}
