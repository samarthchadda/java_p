abstract class base
{
	abstract void run();
	
}


class derived extends base
{
	void run()
	{
		System.out.println("Running Safely");
		
	}
	
	public static void main(String[] args)
	{
		base obj = new derived();
		obj.run();
		
	}

}