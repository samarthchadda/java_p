
public class tryCatch {

	
	public static void main(String[] args) {
		
		try{
			
			int data=50/0;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("EXCEPTION OCCURED "+e);
		}
		System.out.println("Rest of the code");
		
	}

}
