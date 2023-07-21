package Sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,6,7,2,1,3,5,9,8};
		int k = 0 ;
		for(int i = 1 ; i < a.length ;i++) {
			int temp = a[i];
			int j = i-1;
			while(j >= 0 && a[j] > temp) {
				a[j+1] = a[j];
				j--;
				k++;
			}
			a[j+1] =temp;
			k++;
		}
		System.out.println("no of iter "+k);
		for(int array :a) {
			System.out.print(array +" ");
		}

	}

}
