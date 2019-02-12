class bike1 
{
	final void run()
	{
		System.out.println("Running....");
	}
}

class honda extends bike1
{
	public static void main(String[] args)
	{
		honda h = new honda();
		h.run();
	}
}