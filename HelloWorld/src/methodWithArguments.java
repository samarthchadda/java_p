import java.util.Scanner;
public class methodWithArguments {

	
	public static void main(String[] args) {
		
		int result, n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		n= sc.nextInt();
		
		result=square(n);
		System.out.println("Square of "+n+" is: "+result);
		
		

	}
	
	static int square(int i)
	{
		return i*i;
		
	}

}
