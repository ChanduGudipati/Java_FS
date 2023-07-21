package Sorting;

public class SelectonSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,6,7,2,1,3,5,9,8};
		  long start = System.currentTimeMillis();
	        System.out.println(start);
	        int k = 0;
		for(int i =0 ; i< a.length;i++) {
			int mindex =i;
			for(int j = i+1;j<a.length;j++) {
				if(a[mindex] > a[j]) {
					mindex=j;	
				}
				k++;
			}
			int temp = a[i];
			a[i] = a[mindex];
			a[mindex] = temp;
			k++;
		}
		System.out.println("time taken "+ (System.currentTimeMillis()));
		System.out.println("no of iter "+k);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}

	}

}
