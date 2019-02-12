
public class multipleCatch1 {

	
	public static void main(String[] args) {
		
		try
		{
			int arr[] = {1,2};
			arr[2] = 3/0;
		}
		catch(Exception e)    //this block handles all exception
		{
			System.out.println("Generic Exception");
		}
	//	 catch(ArrayIndexOutOfBoundsException e)    //This block is unreachable
		  {
		   System.out.println("array index out of bound exception");
		  }

	}

}
