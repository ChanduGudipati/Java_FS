package solution;

public class Swap2numbers {
	
	static void swapwithThirdvar(int a , int b) {
		System.out.println("the values before Swapping  "+ a +" b is   "+ b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("the values after Swapping  "+ a +" b is   "+ b);
		
	}
	private static void swapwithOutThirdvar(int a, int b) {
		System.out.println("the values before Swapping  "+ a +" b is   "+ b);
		b = a+b; //10+15 =25; b =25;
		a = b - a; // 25 - 10 = 15; a =15
		b = b-a; //25 -15 = 10  b =10;
		System.out.println("the values after Swapping  "+ a +" b is   "+ b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapwithThirdvar(10,15);
		swapwithOutThirdvar(10,15);

	}

	

}
