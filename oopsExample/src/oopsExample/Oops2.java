package oopsExample;

//over Override
class Parent {

	void show() {
		System.out.println("hello Java  oracle_admin");
	}
}

public class Oops2 extends Parent {
	@Override
	void show() {
		System.out.println("hello Java oracle_emp");
	}

	void call() {
		Oops2 op = new Oops2();
		op.show();
		super.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oops2 op = new Oops2();
		op.call();

	}
}
