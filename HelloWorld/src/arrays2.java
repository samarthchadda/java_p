
public class arrays2 {
 
	public static void main(String[] args) {
			
		int a[]=new int[3];   //declaration and instantiation
		
		//initialization
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		int b=a.length;    //length of array
		System.out.println("Length of array: "+b);
		
		//traversing the array
		for(int i=0; i<a.length; i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}
		

	}

}
