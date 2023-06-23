package stringexample;

class EmployeePojo extends Object{

	int age;
	int sal;
	String name;

	public EmployeePojo(int age, int sal, String name) {
		super();
		this.age = age;
		this.sal = sal;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee data is [age=" + age + ", sal=" + sal + ", name=" + name + "]";
	}   
}

public class Employee {
	public static void main(String[] args) {
		EmployeePojo pojo = new EmployeePojo(29, 500, "Sai");
		System.out.println(pojo);
	}
}
