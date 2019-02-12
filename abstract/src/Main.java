abstract class base1
{
	base1()
	{
		System.out.println("Base constructor called");
	}
	
	abstract void func();

}

class derived1 extends base1
{
	derived1()
	{
		System.out.println("Derived Constructor called");
	}
	void func()
	{
		System.out.println("Function called");
	}
}

class Main
{
	public static void main(String[] args)
	{
		derived1 d = new derived1();
		
	}
}