package exceptionexe;
public class ExceptionExample {

	public static void main(String[] args) throws Exception  {
		
		
		
		  try {
		  
			  try {
				  
			  }catch (Exception e) {
				// TODO: handle exception
				  try {
					  
				  }finally {
					
				}
			}
			    
		  }catch (Exception e) { 
			  
		  }
		  //-------------------
		  try {
		  
		  }finally {
		  
		  }
		 //-------------------
		  try {
			  
		  }catch (Exception e) { 
			  
		  }finally {
			  
	     }
		  
		  
		  
		a();
	}
	public static void a() throws Exception {
		try {
		System.out.println("hello");	
		b();
		System.out.println("after exception");
		}finally {
			System.out.println("in final"); 
		}
	}
	public static void b() throws Exception {
		
		c();
	}
	public static void c() throws Exception {
			throw new Exception("Userdefied Exception");
	}

}
