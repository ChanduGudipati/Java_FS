package switch_case;

public class SwitchCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// switch case break
		String DB = "MYsql"; // != "mySql";
		switch (DB) {
		case "mySql":
			System.out.println("value is mySql");
			break;
		case "Oracle":
			System.out.println("value is Oracle");
			break;
		case "MYsql":
			System.out.println("value is MYsql");
			
		default:
			System.out.println("default ");
			break;
		}

	}

}
