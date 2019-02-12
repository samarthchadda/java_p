
import java.util.Scanner;
public class largestOfThreeNumbers {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		
		double largest;
		//using nested if method
		if(a >= b){
			if(a >= c){
				 largest=a;
			}
			else{
				largest=c;
				
			}
		}
		else{
			if(b >= c){
				largest=b;
				
			}
			else{
				largest=c;
				
			}
		}
		
		System.out.println("Largest Number is "+largest);
	
		
		
	}

}
