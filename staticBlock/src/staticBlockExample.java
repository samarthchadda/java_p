
public class staticBlockExample {

	static int a=2;
	static int b;
	static int max;
	
	//static block
	static{
		System.out.println("First Static Block");
		b=a*4;
		
	}
	
	static{
		System.out.println("Second Static Block");
		max=10;
	}
	
	static void m1(int x)
	{
		System.out.println("x = "+x);
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("max = "+max);
		
	}
	
	public static void main(String[] args) {
		
		m1(42);

	}

}
