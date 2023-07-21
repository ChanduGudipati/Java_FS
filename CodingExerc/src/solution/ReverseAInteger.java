package solution;

public class ReverseAInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Integer.MAX_VALUE);
		int a = 2147483646; 
		long reverse = 0;//  6463847412
		int int_reverse= 0;
		while (a != 0) {
			int reminder = a % 10; // 4
			reverse = reverse * 10 + reminder;
			a = a / 10;
		}
		if(reverse < Integer.MAX_VALUE && reverse > Integer.MAX_VALUE) {
			int_reverse =(int )reverse;
		}
		System.out.println(reverse);
	}

}
