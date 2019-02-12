interface x 
{
	public void myMethod();
	
}

interface y
{
	public void myMethod();
	
}


public class multiple implements x,y {
	
	public void myMethod()
	{
		System.out.println("Implementing more than one Interfaces");
	}
	
	public static void main(String[] args) {
		
		multiple obj = new multiple();
		obj.myMethod();

	}

}
