package solution;

public class BinarySearchExample {
 static int k =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 4, 6, 7, 2, 1, 3, 5, 9, 8,1 };
		 int target = a.length-1;
		int index = binarySearch(a,target);
		 if (index >= 0) {
				System.out.println("the " + target + " value is at " + index);
			} else {
				System.out.println("the " + target + " is not available");
			}
		 System.out.println("no of itr "+k);
	}

	private static int binarySearch(int[] a, int target) {
		int min =0; //0
		int max = a.length-1;//50
		
		while(min <= max) {
			int  mid = min +(max-min)/2; // 0+ (50-0) /2 = 25
			int value =a[mid]; // 25  
			if(value < target) { // 25 < 26
				min = mid+1; 
			}else if(value > target) {
				max = mid-1;
			}else {
				return mid;
			}
			k++;
		}
	
		return -1;
		
	}

}
