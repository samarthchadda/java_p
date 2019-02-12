
public class test1 {

	static int data = 30;
	
	static class inner
	{
		void msg()
		{
			System.out.println("Data is : "+data);
		}
	}
	
	public static void main(String[] args) {
		
		test1.inner obj = new test1.inner();
		obj.msg();

	}

}
