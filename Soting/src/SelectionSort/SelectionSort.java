package SelectionSort;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 73, 56, 24, 54, 89, 12, 8, 4 };
		for (int i = 0; i < a.length; i++) {
			int mindex = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[mindex] > a[j])
					mindex = j;
			}
			int temp = a[i];
			a[i] = a[mindex];
			a[mindex] = temp;
		}
        for(int arr:a ) {
        	System.out.print(arr +"\t");
        }
	}

}
