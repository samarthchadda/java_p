
public class staticMethod1 {

	static int a=10;  //static variable
	
	int b=20;    //instance variable 	
	
	//static method
	static void m1(){
		a=20;
		System.out.println("from m1");
		
		// Cannot make a static reference to the non-static field b
		b=10;   //compilation error
		
		// Cannot make a static reference to the non-static method m2()
		m2();  //compilation error
		
		
	}
	
	//instance method 
	void m2()
	{
		System.out.println("from m2");
		
	}
	
	public static void main(String[] args) {
		
		System.out.print("hello");

	}

}
