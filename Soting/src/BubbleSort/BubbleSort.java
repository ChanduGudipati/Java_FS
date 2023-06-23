package BubbleSort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 73, 56, 24, 54, 89, 12, 8, 4 };
		int n = (a.length) - 1;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println("\n");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");

		}

	}

}
