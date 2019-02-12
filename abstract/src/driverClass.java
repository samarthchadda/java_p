abstract class b1
{
	final void func()
	{
		System.out.println("Function called");
	}
}

class d1 extends b1
{
	
}


public class driverClass {

	public static void main(String[] args) {
		b1 obj = new d1();
		obj.func();

	}

}
