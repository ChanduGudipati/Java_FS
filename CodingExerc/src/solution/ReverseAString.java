package solution;

public class ReverseAString {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Method -1
		String word= "SaiChander"; 
		inbuiltFunction(word);
		//Method2 
		reverseStringDec(word);
		System.out.println("");
		reverseStringInc(word);
	}
	private static void reverseStringInc(String word) {
		// TODO Auto-generated method stub
		String reverse =""; char ch ;
		char[] char_array = word.toCharArray();
		for(int i =0 ; i< char_array.length ;i++) {
			ch = char_array[i];
			reverse = ch+reverse;
		}
		System.out.println(reverse);
	}
	private static void reverseStringDec(String word) {
		// TODO Auto-generated method stub
		char[] char_array = word.toCharArray();
		for(int i =char_array.length-1; i>=0 ;i--) {
			System.out.print(char_array[i]);
		}
		
	}
	private static void inbuiltFunction(String word2) {
		StringBuilder sb = new StringBuilder();
		sb.append(word2);
		StringBuilder reverse=sb.reverse();
		System.out.println(reverse);
		
	}

}
