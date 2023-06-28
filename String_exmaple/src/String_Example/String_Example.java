package String_Example;

public class String_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * System.out.println(s2); System.out.println(s2.contains("efg"));
		 * System.out.println(s2.trim()); System.out.println(s2.toUpperCase());
		 * System.out.println(s2.toLowerCase()); //System.out.println(s2.substring(5,
		 * 8));
		 */		
	
		String text ="sai#chander#reddy";
		String[] abc = text.split("#");
		for(String s123 :abc) {
			System.out.println(s123);
		}
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		//System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder(10);
		sb1.append("123456789012324ffffffffffffffffffffffffffffffffffffffffffffffffffffff");
		System.out.println(sb1);
		System.out.println(sb1.reverse());
		
		
		
	}

}
