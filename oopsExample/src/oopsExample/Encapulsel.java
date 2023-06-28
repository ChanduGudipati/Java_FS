package oopsExample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

interface Util{
	
	public boolean vailadteString(String input);
	
	static void dateFormat(String input) throws Exception {
		 SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy");
		 SimpleDateFormat format2 = new SimpleDateFormat("dd-MMM-yy");
		 Date date = format1.parse(input);
		 System.out.println(format2.format(date));
	}
	
	
}
public class Encapulsel implements Util{
	
	@Override
	public  boolean vailadteString(String input) {
		// TODO Auto-generated method stub
		return input.isEmpty();
	}
	
	public static void main(String[] args) throws Exception {
		Util.dateFormat("05/01/1999");
		Encapulsel es = new Encapulsel();
		es.vailadteString("sai");
		
		
	}
}
