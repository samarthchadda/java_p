
public class nestedTry {

	
	public static void main(String[] args) {
		
		try
		{
			int arr[] = {5,0,1,2};
			try
			{
				int x= arr[3]/arr[1];
			}
			catch(ArithmeticException ae)
			{
				System.out.println("Divide by Zero");
			}
			
			arr[4]=3;
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index out of bound exception");
		}

	}

}
