package Sorting;

public class Recs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reccc(0);

	}

	private static void reccc(int i) {
		System.out.println(i);
		if(i == 5) return;	
		reccc(  ++ i);
	}

}
