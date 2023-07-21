package Sorting;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,6,7,2,1,3,5,9,8};
		mergeSortDiv(a);
		for(int array :a) {
			System.out.print(array +" ");
		}

	}

	private static void mergeSortDiv(int[] a) {
		int lent = a.length;
		int mid =lent/2;
		if(lent <=1 ) return;
		int leftArray[] = new int[mid]; 
		int rightArray[] = new int[lent-mid]; 
		int i=0,j=0;
		for(;i<lent;i++) {
			if(i<mid) {
				leftArray[i]= a[i];
			}else {
				rightArray[j]= a[i];
				j++;
			}
		}
		mergeSortDiv(leftArray);
		mergeSortDiv(rightArray);
		merge(leftArray,rightArray,a);
	}

	private static void merge(int[] leftArray, int[] rightArray, int[] a) {
		
		int lsize = a.length/2;
		int rsize = a.length- lsize;
		int i =0 , l=0,r = 0;
		
		while(l<lsize && r < rsize) {
			if(leftArray[l] < rightArray[r]) {
				a[i] = leftArray[l];
				i++;
				l++;
				
			}else {
				a[i] = rightArray[r];
				i ++;
				r ++;
			}
		}
		while(l < lsize) {
			a[i]= leftArray[l];
			i++;
			l++;
		}
		while(r < rsize) {
			a[i]= rightArray[r];
			i++;
			r++;
		}
		
	}


}
