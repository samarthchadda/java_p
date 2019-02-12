
public class methodOverloading1 {

	private static void display(int a)
	{
		System.out.println("Integer data: "+a);
	}
	
	private static void display(String a)
	{
		System.out.println("String data: "+a);
	}
	
	
	public static void main(String[] args) {
		display(1);
		display("Hello");
		

	}

}
