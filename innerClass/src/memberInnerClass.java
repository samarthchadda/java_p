
public class memberInnerClass {
	
	private int data = 30;
	
	class inner {
			
		void msg()
		{
			System.out.println("Data is "+data);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		memberInnerClass obj = new memberInnerClass();
		memberInnerClass.inner in = obj.new inner();
		in.msg();
		
		
	}
	
}