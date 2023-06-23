package inhertance;

class Parent {
	int a = 10;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}

class Child extends Parent {
	private void method() {
		Child c = new Child();
		System.out.println(c.getA());
	}

}
class Child2 extends Parent {
	private void method() {
		Child2 c = new Child2();
		System.out.println(c.getA());
	}

}

public class InheritaneExample extends Parent {

	public static void main(String[] args) {
		InheritaneExample example = new InheritaneExample();
		// TODO Auto-generated method stub
		System.out.println(example.getA());// parent class

	}

}
