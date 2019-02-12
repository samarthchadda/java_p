
public class methodExampleNonStatic {

	
	public static void main(String[] args) {

		System.out.println("My name is samarth");
		
		methodExampleNonStatic m= new methodExampleNonStatic();
		//method call
		m.myMethod();
		
		System.out.println("Method was executed successfully");
				

	}
	
	//method defination
	private void myMethod(){
		System.out.println("Printing from inside myMethod()");
		
		
	}

}
