
public class constructorsMain {

	private int x;
	
	//constructor
	private constructorsMain()
	{
		System.out.println("Constructor called");
		x=5;
		
	}
	
	
	public static void main(String[] args) {
		
		constructorsMain obj = new constructorsMain();
		System.out.println("Value of x = "+obj.x);		

	}

}
