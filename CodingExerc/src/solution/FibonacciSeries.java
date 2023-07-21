package solution;

public class FibonacciSeries {

	static int n = 10 , n2=1 ,n3=0,n1=0;
	static int[] a = new int[n+1];
	public static void main(String[] args) {
		System.out.print(n1+" "+n2 );
		a[0] = n1;
		a[1] =n2;
		recurssion(n-2);
		System.out.println();
		for(int i :a) {
			System.out.print(i+" ");
		}
	}

	private static void recurssion(int i) {
		// TODO Auto-generated method stub
		if(i > 0) {
			n3 = n2+n1;
			a[i-1] = n3;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			
			recurssion(i-1);
		}
		
			
		}	
	

	private static void itterMethod(int[] a) {
		for(int i = 2 ; i < a.length ; i++) {
			a[i] = a[i-1]+a[i-2];
		}
		for(int i :a) {
			System.out.print(i+" ");
		}
		
	}

}
