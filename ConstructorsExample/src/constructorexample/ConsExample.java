package constructorexample;


class Eployess {
	int emp_id;
	int age;
	String name;
	Eployess(int a , int b , String c){
		this.emp_id=a;
		this.age=b;
		this.name=c;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
}
public class ConsExample {
	public  ConsExample() {
		// TODO Auto-generated constructor stub
      System.out.println("cons called ");
	}
	public static String method(String name) {
              return name.toUpperCase();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsExample object_var = new ConsExample();
		Eployess emp = new Eployess(12, 29, "SAI");  
        System.out.println( emp.getName());
	}

}
