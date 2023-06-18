package conditionsexample;

public class ConditionsExample {

	String db_comnn = "";
	int global_a;

	ConditionsExample() {
         new ConditionsExample(10);
	}
	ConditionsExample(int a) {
		System.out.println("from int cons");
		this.global_a = a;
	}
	public int sum() {

		return global_a;
	}

	public static void main(String[] args) {
		ConditionsExample obj_var = new ConditionsExample();
		System.out.println(obj_var.sum());
		

	}

}
