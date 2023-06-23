package inhertance;

interface A {
	void draw();

}

interface B {
	void draw();

}

public class MultipleInhert implements A,B{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public void draw() {
		System.out.println("tra");
		
	}

}
