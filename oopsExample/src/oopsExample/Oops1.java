package oopsExample;

//method over loading
public class Oops1 {
	public static int arthOps() {
		return 0;
	}
	public static int arthOps(int a) {
		return a;
	}
	public static int arthOps(int a , int b) {
		System.out.println(" arthOps called with 2 int values");
		return a+b;
	}
	public static float arthOps(float a , float b) {
		System.out.println(" arthOps called with 2 float values");
		return a+b;
	}
	public static String arthOps(String c) {
		System.out.println(" arthOps called with 1 String values");
		return c.toUpperCase();
	}
	public static void main(String[] args) {
		System.out.println(arthOps(10));
	}
}
