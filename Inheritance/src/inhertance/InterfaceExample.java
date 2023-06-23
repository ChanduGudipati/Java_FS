package inhertance;
public abstract class InterfaceExample {
	abstract void show();
	abstract void draw();
	abstract void show123();
}
class B123 extends InterfaceExample {
	@Override
	public void show() {
	}
	@Override
	public void draw() {	
	}
	@Override
	public void show123() {		
	}
}
class D123 extends InterfaceExample {
	@Override
	public void show() {
	}
	@Override
	public void draw() {	
	}
	@Override
	public void show123() {		
	}
}
class E123 extends InterfaceExample {
	@Override
	public void show() {
	}
	@Override
	public void draw() {	
	}
	@Override
	public void show123() {		
	}
}
class C123 extends Object{
	InterfaceExample  imp =null;
	public  void impl() {
		imp = new B123();
        imp.draw();
	}
}