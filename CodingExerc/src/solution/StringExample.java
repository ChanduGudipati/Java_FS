package solution;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("the value is "+ 10 + 12);
		
		String s1 = "abc";
		String s2 ="abc";
		System.out.println("value is "+s1 == s2); // value is abc == abc
		System.out.println(s1.equals(s2));
		s2 =s2.concat(s1);
		System.out.println(s2);

	}

}
