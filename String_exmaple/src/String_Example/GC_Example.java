package String_Example;

public class GC_Example {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Runtime runtime = Runtime.getRuntime();
		long startMemory =runtime.freeMemory();
		System.out.println("start memomry "+startMemory);
		String s10 ="abc";String s1 ="abc";
		String s9 ="abc";String s2 ="abc";
		String s8 ="abc";String s3 ="abc";
		String s7 ="abc";String s4 ="abc";
		String s6 ="abc";String s5 ="abc";
		s1 =null;s2 =null;s3 =null;s4 =null;s5 =null;
		System.gc();
		runtime.gc();
		Thread.sleep(10000);
		long endMemory =runtime.freeMemory();
		System.out.println("end memory "+endMemory);
		System.out.println("diff " + (startMemory-endMemory));
	}
}
