import java.util.Scanner;


public class continueStatement1 {

	
	public static void main(String[] args) {
		
		double num, sum=0.0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<6; i++)
		{
			System.out.println("Enter a number: ");
			num = sc.nextDouble();
			
			if(num <= 0.0)
			{
				continue;
				
			}
			sum += num;
			
			
		}
		System.out.println("Sum = "+sum);
	}

}
