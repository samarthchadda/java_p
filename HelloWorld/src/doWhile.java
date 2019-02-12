import java.util.Scanner;
public class doWhile {

	public static void main(String[] args) {
		
		//program to calculate sum of numbers entered by user until user enters 0
		
		double num,sum=0.0;
		Scanner sc= new Scanner(System.in);
		do
		{
			System.out.println("Enter a number: ");
			num=sc.nextDouble();
			sum += num;
		}while(num != 0.0);
		
		System.out.println("Sum = "+sum);
		
//		int i=10;
//		while(i==10)
//		{
//			System.out.println("Hello");
//		}
//		
	}	
}
