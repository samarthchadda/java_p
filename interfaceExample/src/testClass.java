interface in 
{
	//public , static  and final by default
	 int a = 10;
	
	//public and abstract
	void display();
	
}

class testClass implements in
{
	public void display()
	{
		System.out.println("Geek");
		
	}
	
	//driver code
	public static void main(String[] a)
	{
		testClass t = new testClass();
		t.display();
		//t.a =30;   //compilation error , as 'a' is final 
		System.out.println(t.a);
	}
	
}