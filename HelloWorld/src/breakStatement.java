import java.util.Scanner;
public class breakStatement {

	public static void main(String[] args) {
		//program that calculates the sum of numbers entered by the user until user enters a negative number
		double num,sum=0.0;
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter a number: ");
			num=sc.nextDouble();
			
			if(num <0.0){
				break;
				
			}
			sum += num;		
			
		}
		System.out.println("Sum = "+sum);
		

	}

}
