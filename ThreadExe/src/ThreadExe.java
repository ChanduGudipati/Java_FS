
class Thread1 extends Thread {

	@Override
	public void run() { // Running State
		Thread.currentThread().setName("Thread1_class");
		Thread.currentThread().setPriority(10);
		System.out.println("priority of the thread1 is " + Thread.currentThread().getPriority());
		for (int i = 0; i < 9; i++) {
			try {
			} catch (Exception e) {
				System.out.println("exception");
			}
			System.out.println("from  " + Thread.currentThread().getName() + " " + i);
		}
	}
}

class Thread2 extends Thread {

	@Override
	public void run() { // Running State
		Thread.currentThread().setPriority(MIN_PRIORITY);
		System.out.println("priority of the thread2 is " + Thread.currentThread().getPriority());
		Thread.currentThread().setName("Thread2_class");

		for (int i = 0; i < 9; i++) {
			System.out.println("from " + Thread.currentThread().getName() + " " + i);
		}
	}
}

public class ThreadExe {

	public static void main(String[] args) throws Exception {

		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start(); // runnable

		t2.start();
		System.out.println("completed the exection");
		Thread.currentThread().setName("This is main thread");
		String s = Thread.currentThread().getName();

		System.out.println("name of the Thread is " + s);
		System.out.println("priority of the main  is " + Thread.currentThread().getPriority());

	}

}
