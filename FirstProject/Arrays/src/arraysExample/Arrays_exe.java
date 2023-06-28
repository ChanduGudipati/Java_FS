package arraysExample;

import java.util.Arrays;
import java.util.Random;

public class Arrays_exe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a1 =10;//Integer a1 = Interger.valueOf(a1);
//		int a2=12;
//		int a3 =13;
//		int a4 =14;
		int[] a = { 1, 3, 4, 6, 7 };
		int[] a7 = new int[5];
		Random ran = new Random();
		for (int i = 0; i <= 4; i++) {
			a7[i] = ran.nextInt(10);
		}
		/*
		 * for (int i = 0; i < a7.length+1; i++) { System.out.print("value is "+a7[i]
		 * +"\t"); }
		 */
		for (int i : a7) {
			System.out.println(i);
		}
		int[] a2 = new int[250];
		   for(int j =0 ;j < 10 ;j++ ) {
			 a2[j] = ran.nextInt(10);
		  }
		   for(int j =0 ;j < a2.length ;j++ ) {
				  System.out.print(a2[j] +"\t");
			  } 
		  
	
	
	}
	
	
	  
	
	
	
	
	
	
	
}
