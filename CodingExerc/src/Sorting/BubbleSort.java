package Sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,6,7,2,1,3,5,9,8};
        int n = (a.length)-1;
        long start = System.currentTimeMillis();
        System.out.println(start);
        int k = 0;
		for(int i = 0 ; i<= n ; i++) {
			for(int j = 0; j <= n-1 ; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j]= a[j+1];
					a[j+1] = temp;
				}
				k++;
			}
		 k++;	
		}
		System.out.println("time taken "+ (System.currentTimeMillis()));
		System.out.println("no of iter "+k);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
			
		 {
			
		}
	}

}
