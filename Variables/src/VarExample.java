
public class VarExample {
    
	int a = 10;
	//static int b =12;
	
	static int b;
	
	static {
		b =12;
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		System.out.println("main");
		//VarExample varExample = new VarExample();
		//varExample.met();
		//VarExample.staticmet();
	//	System.out.println(a);
		System.out.println(b);
	}
	public void met() {
		// TODO Auto-generated method stub
		System.out.println(a);
		System.out.println(b);
	}
	public static void staticmet() {
		// TODO Auto-generated method stub
	}
}
