package Sorting;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,6,7,2,1,3,5,9,8};
		quickSort(a, 0, a.length-1);
		System.out.println();
		for(int a1:a) {
			System.out.print(a1+" ");
		}
		System.out.println();

	}

	private static void quickSort(int[] a, int start, int end) {
		// TODO Auto-generated method stub
		System.out.println("end "+ end +" start "+start);
		if( end <= start )return ;
	
		int pivot =partion (a, start,end);
		System.out.println("pivot "+pivot);
		quickSort (a, start,pivot-1);
		quickSort (a, pivot+1,end);
		
	}
	
	private static int partion(int[] a, int start, int end) {
	int pivot = a[end];
	System.out.println("pivot "+pivot);
	int i =start-1;
	for(int j=start ; j<=end-1 ;j++) {
		if(a[j]<pivot) {
			i++;
			int temp =a[i];
			a[i] =a[j];
			a[j] =temp;	
		}
	}
	i++;
	int temp =a[i];
	a[i] =a[end];
	a[end] =temp;	
	return i;
	} 

}
