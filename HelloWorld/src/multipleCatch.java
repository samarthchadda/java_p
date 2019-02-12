
public class multipleCatch {

	
	public static void main(String[] args) {
		try
		{
		int arr[] = {1,2};
		arr[2]= 3/0;   //exception
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bound Exception");
		}
		
		System.out.println("Rest of the code");

	}

}
